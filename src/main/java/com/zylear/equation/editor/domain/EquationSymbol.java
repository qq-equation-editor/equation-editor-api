package com.zylear.equation.editor.domain;

import java.util.Date;

public class EquationSymbol {
    private Integer id;

    private String symbolName;

    private Byte symbolCategory;

    private String symbolLatex;

    private Boolean isDeleted;

    private Date createTime;

    private Date lastUpdateTime;

    private String symbolHtmlContent;

    private Boolean isLeft;

    public Boolean getIsLeft() {
        return isLeft;
    }

    public void setIsLeft(Boolean isLeft) {
        this.isLeft = isLeft;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public Byte getSymbolCategory() {
        return symbolCategory;
    }

    public void setSymbolCategory(Byte symbolCategory) {
        this.symbolCategory = symbolCategory;
    }

    public String getSymbolLatex() {
        return symbolLatex;
    }

    public void setSymbolLatex(String symbolLatex) {
        this.symbolLatex = symbolLatex;
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

    public String getSymbolHtmlContent() {
        return symbolHtmlContent;
    }

    public void setSymbolHtmlContent(String symbolHtmlContent) {
        this.symbolHtmlContent = symbolHtmlContent;
    }
}