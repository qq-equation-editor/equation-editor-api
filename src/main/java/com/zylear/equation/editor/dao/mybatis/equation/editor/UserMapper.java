package com.zylear.equation.editor.dao.mybatis.equation.editor;

import com.zylear.equation.editor.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    User findByUserName(@Param("userName") String userName);
}