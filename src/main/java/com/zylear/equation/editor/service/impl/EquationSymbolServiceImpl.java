package com.zylear.equation.editor.service.impl;

import com.zylear.equation.editor.dao.mybatis.equation.editor.EquationSymbolMapper;
import com.zylear.equation.editor.domain.EquationSymbol;
import com.zylear.equation.editor.service.EquationSymbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xiezongyu on 2019/8/20.
 */
@Component
public class EquationSymbolServiceImpl implements EquationSymbolService {

    @Autowired
    private EquationSymbolMapper equationSymbolMapper;


    @Override
    public List<EquationSymbol> findAll() {
       return equationSymbolMapper.findAll();
    }
}
