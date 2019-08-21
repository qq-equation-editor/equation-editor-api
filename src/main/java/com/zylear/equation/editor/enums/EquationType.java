package com.zylear.equation.editor.enums;

/**
 * Created by xiezongyu on 2018/4/9.
 */
public enum EquationType {

    unknown(-1),
    template_equation(1),
    user_equation(2),;
    private Integer value;

    EquationType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

//    public Byte getByteValue() {
//        return (byte) value.;
//    }


    public static EquationType valueOf(Integer value) {
        for (EquationType equationType : EquationType.values()) {
            if (equationType.getValue().equals(value)) {
                return equationType;
            }
        }
        throw new RuntimeException("unknown EquationType value:" + value);
    }

}
