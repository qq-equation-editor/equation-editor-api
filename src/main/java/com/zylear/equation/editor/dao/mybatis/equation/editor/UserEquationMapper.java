package com.zylear.equation.editor.dao.mybatis.equation.editor;

import com.zylear.equation.editor.domain.UserEquation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserEquationMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UserEquation record);

    int insertSelective(UserEquation record);

    UserEquation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEquation record);

    int updateByPrimaryKey(UserEquation record);


    List<UserEquation> findByUserId(@Param("userId") Integer userId);

    void markDeleted(@Param("userId") Integer userId,
                     @Param("equationId") Integer equationId);

    UserEquation findByUserIdAndEquationId(@Param("userId") Integer userId,
                                           @Param("equationId") Integer equationId);
}