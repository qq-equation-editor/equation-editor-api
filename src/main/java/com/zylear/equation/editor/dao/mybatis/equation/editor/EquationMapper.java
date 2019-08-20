package com.zylear.equation.editor.dao.mybatis.equation.editor;

import com.zylear.equation.editor.domain.Equation;

public interface EquationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Equation record);

    int insertSelective(Equation record);

    Equation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Equation record);

    int updateByPrimaryKeyWithBLOBs(Equation record);

    int updateByPrimaryKey(Equation record);
}