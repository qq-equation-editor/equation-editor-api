package com.zylear.equation.editor.service;

import com.zylear.equation.editor.domain.Equation;

import java.util.List;

/**
 * Created by xiezongyu on 2019/8/20.
 */
public interface EquationService {

    List<Equation> findByEquationTypeAndEquationCategory(Byte equationType, Byte equationCategory);

}
