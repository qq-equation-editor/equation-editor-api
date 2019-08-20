package com.zylear.equation.editor.service.impl;

import com.zylear.equation.editor.dao.mybatis.equation.editor.EquationMapper;
import com.zylear.equation.editor.domain.Equation;
import com.zylear.equation.editor.service.EquationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xiezongyu on 2019/8/20.
 */
@Component
public class EquationServiceImpl implements EquationService {

    @Autowired
    private EquationMapper equationMapper;


    @Override
    public List<Equation> findByEquationTypeAndEquationCategory(Byte equationType, Byte equationCategory) {
        return equationMapper.findByEquationTypeAndEquationCategory(equationType, equationCategory);
    }
}
