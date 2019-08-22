package com.zylear.equation.editor.dao.mybatis.equation.editor;

import com.zylear.equation.editor.domain.EquationSymbol;

import java.util.List;

public interface EquationSymbolMapper {

    List<EquationSymbol> findAll();
}