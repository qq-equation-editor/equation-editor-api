package com.zylear.equation.editor.service;

import com.zylear.equation.editor.domain.UserEquation;

import java.util.List;

/**
 * Created by xiezongyu on 2019/8/20.
 */
public interface UserEquationService {

    List<UserEquation> findByUserId(Integer userId);

    void insert(UserEquation userEquation);
}
