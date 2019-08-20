package com.zylear.equation.editor.dao.mybatis.equation.editor;

import com.zylear.equation.editor.domain.UserEquation;

public interface UserEquationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEquation record);

    int insertSelective(UserEquation record);

    UserEquation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEquation record);

    int updateByPrimaryKey(UserEquation record);
}