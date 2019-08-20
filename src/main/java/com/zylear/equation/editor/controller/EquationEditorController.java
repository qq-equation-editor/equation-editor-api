package com.zylear.equation.editor.controller;

import com.zylear.equation.editor.bean.SymbolInfoBean;
import com.zylear.equation.editor.domain.Equation;
import com.zylear.equation.editor.domain.EquationSymbol;
import com.zylear.equation.editor.service.EquationService;
import com.zylear.equation.editor.service.EquationSymbolService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "/pb/v1/equation-editor")
public class EquationEditorController {

    @Autowired
    private EquationSymbolService equationSymbolService;
    @Autowired
    private EquationService equationService;

    @ResponseBody
    @RequestMapping(value = "/all-symbol", method = RequestMethod.GET)
    public List<EquationSymbol> allSymbol() {
        return equationSymbolService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/template-equation", method = RequestMethod.GET)
    public List<Equation> getBiddingList() {
//        List<Equation>
        return null;
    }


}
