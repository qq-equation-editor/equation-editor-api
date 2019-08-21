package com.zylear.equation.editor.manager;

import com.zylear.equation.editor.config.DataSourceEquationEditorConfig;
import com.zylear.equation.editor.domain.Equation;
import com.zylear.equation.editor.domain.UserEquation;
import com.zylear.equation.editor.enums.EquationType;
import com.zylear.equation.editor.service.EquationService;
import com.zylear.equation.editor.service.UserEquationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by xiezongyu on 2019/8/21.
 */
@Component
public class UserEquationTxManager {


    @Autowired
    private EquationService equationService;
    @Autowired
    private UserEquationService userEquationService;

    @Transactional(DataSourceEquationEditorConfig.TX_MANAGER)
    public void addUserEquation(Integer userId, String equationName, String equationLatex) {
        Equation equation = new Equation();
        equation.setEquationType(EquationType.user_equation.getValue().byteValue());
        equation.setEquationCategory((byte) 1);
        equation.setEquationName(equationName);
        equation.setEquationImg("");
        equation.setEquationLatex(equationLatex);
        equation.setIsDeleted(false);
        equation.setCreateTime(new Date());
        equation.setLastUpdateTime(new Date());
        equationService.insert(equation);
        UserEquation userEquation = new UserEquation();
        userEquation.setUserId(userId);
        userEquation.setEquationId(equation.getId());
        userEquation.setIsDeleted(false);
        userEquation.setCreateTime(new Date());
        userEquation.setLastUpdateTime(new Date());
        userEquationService.insert(userEquation);
    }

}
