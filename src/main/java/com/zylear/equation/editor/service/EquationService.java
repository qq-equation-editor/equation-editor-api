package com.zylear.equation.editor.service;

import com.zylear.equation.editor.domain.Equation;

import java.util.Collection;
import java.util.List;

/**
 * Created by xiezongyu on 2019/8/20.
 */
public interface EquationService {

    List<Equation> findByEquationTypeAndEquationCategory(Byte equationType, Byte equationCategory);

    List<Equation> findByIds(Collection<Integer> ids);

    void insert(Equation equation);

    Equation findById(Integer equationId);

    void markDeleted(Integer equationId);
}
