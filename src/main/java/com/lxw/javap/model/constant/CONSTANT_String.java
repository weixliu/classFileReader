package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class CONSTANT_String extends CpInfo {
    @Getter
    @Setter
    private short stringIndex;

    @Override
    public String toString() {
        return "CONSTANT_String{" +
                "stringIndex=" + stringIndex +
                ", tag=" + tag2String(tag) +
                '}';
    }
}
