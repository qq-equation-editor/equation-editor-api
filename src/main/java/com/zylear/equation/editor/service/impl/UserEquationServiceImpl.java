package com.zylear.equation.editor.service.impl;

import com.zylear.equation.editor.dao.mybatis.equation.editor.UserEquationMapper;
import com.zylear.equation.editor.domain.UserEquation;
import com.zylear.equation.editor.service.UserEquationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xiezongyu on 2019/8/20.
 */
@Component
public class UserEquationServiceImpl implements UserEquationService {

    @Autowired
    private UserEquationMapper userEquationMapper;

    @Override
    public List<UserEquation> findByUserId(Integer userId) {
        return userEquationMapper.findByUserId(userId);
    }

    @Override
    public void insert(UserEquation userEquation) {
        userEquationMapper.insert(userEquation);
    }

    @Override
    public void markDeleted(Integer userId, Integer equationId) {
        userEquationMapper.markDeleted(userId, equationId);
    }

    @Override
    public UserEquation findByUserIdAndEquationId(Integer userId, Integer equationId) {
        return userEquationMapper.findByUserIdAndEquationId(userId, equationId);
    }
}
