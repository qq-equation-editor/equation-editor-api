package com.zylear.equation.editor.service.impl;

import com.zylear.equation.editor.dao.mybatis.equation.editor.UserEquationMapper;
import com.zylear.equation.editor.service.UserEquationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by xiezongyu on 2019/8/20.
 */
@Component
public class UserEquationServiceImpl implements UserEquationService {

    @Autowired
    private UserEquationMapper userEquationMapper;

}
