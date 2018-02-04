package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class CONSTANT_MethodType extends CpInfo {
    @Setter
    @Getter
    private short descriptorIndex;

    @Override
    public String toString() {
        return "CONSTANT_MethodType{" +
                "descriptorIndex=" + descriptorIndex +
                ", tag=" + tag2String(tag) +
                '}';
    }
}