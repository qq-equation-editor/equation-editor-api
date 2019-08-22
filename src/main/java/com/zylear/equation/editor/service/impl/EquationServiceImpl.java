package com.zylear.equation.editor.service.impl;

import com.zylear.equation.editor.dao.mybatis.equation.editor.EquationMapper;
import com.zylear.equation.editor.domain.Equation;
import com.zylear.equation.editor.service.EquationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
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

    @Override
    public List<Equation> findByIds(Collection<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return Collections.emptyList();
        }
        return equationMapper.findByIds(ids);
    }

    @Override
    public void insert(Equation equation) {
        equationMapper.insert(equation);
    }

    @Override
    public Equation findById(Integer equationId) {
        return equationMapper.findById(equationId);
    }

    @Override
    public void markDeleted(Integer equationId) {
        equationMapper.markDeleted(equationId);
    }
}
