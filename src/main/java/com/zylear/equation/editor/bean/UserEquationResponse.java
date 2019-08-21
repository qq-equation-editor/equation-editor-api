package com.zylear.equation.editor.bean;

import com.zylear.equation.editor.domain.Equation;

import java.util.Collections;
import java.util.List;

/**
 * Created by xiezongyu on 2019/8/21.
 */
public class UserEquationResponse {

    private BaseResponse baseResponse;
    private List<Equation> equations = Collections.emptyList();

    public BaseResponse getBaseResponse() {
        return baseResponse;
    }

    public void setBaseResponse(BaseResponse baseResponse) {
        this.baseResponse = baseResponse;
    }

    public List<Equation> getEquations() {
        return equations;
    }

    public void setEquations(List<Equation> equations) {
        this.equations = equations;
    }
}
