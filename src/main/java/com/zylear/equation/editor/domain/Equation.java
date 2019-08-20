package com.zylear.equation.editor.domain;

import java.util.Date;

public class Equation {
    private Integer id;

    private Byte equationType;

    private Byte equationCategory;

    private String equationName;

    private String equationImg;

    private Boolean isDeleted;

    private Date createTime;

    private Date lastUpdateTime;

    private String equationLatex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getEquationType() {
        return equationType;
    }

    public void setEquationType(Byte equationType) {
        this.equationType = equationType;
    }

    public Byte getEquationCategory() {
        return equationCategory;
    }

    public void setEquationCategory(Byte equationCategory) {
        this.equationCategory = equationCategory;
    }

    public String getEquationName() {
        return equationName;
    }

    public void setEquationName(String equationName) {
        this.equationName = equationName;
    }

    public String getEquationImg() {
        return equationImg;
    }

    public void setEquationImg(String equationImg) {
        this.equationImg = equationImg;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getEquationLatex() {
        return equationLatex;
    }

    public void setEquationLatex(String equationLatex) {
        this.equationLatex = equationLatex;
    }
}