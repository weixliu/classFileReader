package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class CONSTANT_Float extends CpInfo {
    @Setter
    @Getter
    private float floatValue;

    @Override
    public String toString() {
        return "CONSTANT_Float{" +
                "bytes=" + floatValue +
                ", tag=" + tag2String(tag) +
                '}';
    }
}
