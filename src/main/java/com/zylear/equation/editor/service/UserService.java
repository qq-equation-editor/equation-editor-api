package com.zylear.equation.editor.service;

import com.zylear.equation.editor.domain.User;

/**
 * Created by xiezongyu on 2019/8/20.
 */
public interface UserService {

    User findByUserName(String userName);

    void insert(User user);
}
