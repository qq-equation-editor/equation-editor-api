package com.zylear.equation.editor.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.zylear.equation.editor.bean.BaseResponse;
import com.zylear.equation.editor.bean.IsLoginResponse;
import com.zylear.equation.editor.bean.UserEquationResponse;
import com.zylear.equation.editor.domain.Equation;
import com.zylear.equation.editor.domain.EquationSymbol;
import com.zylear.equation.editor.domain.User;
import com.zylear.equation.editor.domain.UserEquation;
import com.zylear.equation.editor.enums.EquationType;
import com.zylear.equation.editor.manager.UserEquationTxManager;
import com.zylear.equation.editor.service.EquationService;
import com.zylear.equation.editor.service.UserEquationService;
import com.zylear.equation.editor.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by xiezongyu on 2019/8/21.
 */
@Controller
@RequestMapping(value = "/pb/v1/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private EquationService equationService;
    @Autowired
    private UserEquationService userEquationService;
    @Autowired
    private UserEquationTxManager userEquationTxManager;


    @ResponseBody
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public BaseResponse ogout(HttpServletRequest request) {
      request.getSession().removeAttribute("userName");
        return BaseResponse.SIMPLE_SUCC_RESPONSE;
    }

    @ResponseBody
    @RequestMapping(value = "/is-login", method = RequestMethod.GET)
    public IsLoginResponse isLogin(HttpServletRequest request) {
        IsLoginResponse response = new IsLoginResponse();
        String userName = (String) request.getSession().getAttribute("userName");
        if (StringUtils.isEmpty(userName)) {
            response.setBaseResponse(new BaseResponse(2, "请先登录"));
            return response;
        } else {
            response.setBaseResponse(BaseResponse.SIMPLE_SUCC_RESPONSE);
        }

        response.setUserName(userName);
        return response;
    }


    @ResponseBody
    @RequestMapping(value = "/register-or-login", method = RequestMethod.POST)
    public BaseResponse registerOrLogin(@RequestParam("userName") String userName,
                                        @RequestParam("password") String password,
                                        HttpServletRequest request) {
        User user = userService.findByUserName(userName);
        System.out.println(request.getSession().getAttribute("userName"));
        if (user == null) {
            user = formUser(userName, password);
            userService.insert(user);
            request.getSession().setAttribute("userName", userName);
            return BaseResponse.SIMPLE_SUCC_RESPONSE;
        } else {
            if (user.getPassword().equals(password)) {
                request.getSession().setAttribute("userName", userName);
                return BaseResponse.SIMPLE_SUCC_RESPONSE;
            } else {
                return new BaseResponse(2, "密码不正确");
            }
        }
    }

    private User formUser(String userName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setIsDeleted(false);
        user.setCreateTime(new Date());
        user.setLastUpdateTime(new Date());
        return user;
    }

    @ResponseBody
    @RequestMapping(value = "/equation", method = RequestMethod.GET)
    public UserEquationResponse equation(HttpServletRequest request) {
        UserEquationResponse response = new UserEquationResponse();
        String userName = (String) request.getSession().getAttribute("userName");
        if (StringUtils.isEmpty(userName)) {
            response.setBaseResponse(new BaseResponse(2, "请先登录"));
            return response;
        } else {
            response.setBaseResponse(BaseResponse.SIMPLE_SUCC_RESPONSE);
        }

        User user = userService.findByUserName(userName);
        if (user != null) {
            List<UserEquation> userEquations = userEquationService.findByUserId(user.getId());
            List<Equation> equations = equationService.findByIds(getIds(userEquations));
            response.setEquations(equations);
        }
        return response;
    }

    private List<Integer> getIds(List<UserEquation> userEquations) {
        List<Integer> list = new ArrayList<>(userEquations.size());
        for (UserEquation userEquation : userEquations) {
            list.add(userEquation.getEquationId());
        }
        return list;
    }


    @ResponseBody
    @RequestMapping(value = "/add-equation", method = RequestMethod.POST)
    public BaseResponse addEquation(HttpServletRequest request,
                                    @RequestParam("equationName") String equationName,
                                    @RequestParam("equationLatex") String equationLatex) {
        String userName = (String) request.getSession().getAttribute("userName");
        if (StringUtils.isEmpty(userName)) {
            return new BaseResponse(2, "请先登录");
        }

        User user = userService.findByUserName(userName);
        if (user == null) {
            return new BaseResponse(2, "请先登录");
        }
        List<UserEquation> userEquations = userEquationService.findByUserId(user.getId());
        if (userEquations.size() > 5) {
            //
        }
        List<Integer> ids = getIds(userEquations);
        List<Equation> equations = equationService.findByIds(ids);
        for (Equation equation : equations) {
            if (equation.getEquationName().equals(equationName)) {
                return new BaseResponse(2, "公式名称重复，请换一个名称");
            }
        }
        userEquationTxManager.addUserEquation(user.getId(), equationName, equationLatex);
        return BaseResponse.SIMPLE_SUCC_RESPONSE;
    }


    @ResponseBody
    @RequestMapping(value = "/delete-equation", method = RequestMethod.POST)
    public BaseResponse deleteEquation(HttpServletRequest request,
                                       @RequestParam("equationId") Integer equationId) {
        String userName = (String) request.getSession().getAttribute("userName");
        if (StringUtils.isEmpty(userName)) {
            return new BaseResponse(2, "请先登录");
        }
        User user = userService.findByUserName(userName);
        if (user == null) {
            return new BaseResponse(2, "请先登录");
        }

        userEquationTxManager.deleteUserEquation(user.getId(), equationId);
        return BaseResponse.SIMPLE_SUCC_RESPONSE;
    }


}
