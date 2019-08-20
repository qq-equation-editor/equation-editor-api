package com.zylear.equation.editor.dao.mybatis.equation.editor;

import com.zylear.equation.editor.domain.EquationSymbol;

import java.util.List;

public interface EquationSymbolMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(EquationSymbol record);

    int insertSelective(EquationSymbol record);

    EquationSymbol selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EquationSymbol record);

    int updateByPrimaryKeyWithBLOBs(EquationSymbol record);

    int updateByPrimaryKey(EquationSymbol record);


    List<EquationSymbol> findAll();
}