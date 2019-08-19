package com.zylear.equation.editor.controller;

import com.zylear.equation.editor.bean.SymbolInfoBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiezongyu on 2019/8/19.
 */
@Controller
@RequestMapping(value = "/equation-editor")
public class EquationController {

    @ResponseBody
    @RequestMapping(value = "/all-symbol", method = RequestMethod.GET)
    public List<SymbolInfoBean> getBiddingList() {
        List<SymbolInfoBean> list = new ArrayList<>();
        SymbolInfoBean bean = new SymbolInfoBean();
        bean.setSymbolName("sqrt");
        bean.setSymbolContent("\\sqrt{}");
        list.add(bean);
        return list;
    }


}
