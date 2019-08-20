package com.zylear.equation.editor.service.impl;

import com.zylear.equation.editor.dao.mybatis.equation.editor.UserMapper;
import com.zylear.equation.editor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by xiezongyu on 2019/8/20.
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

}
