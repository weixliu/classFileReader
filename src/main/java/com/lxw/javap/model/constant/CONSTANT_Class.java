package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class CONSTANT_Class extends CpInfo {
    @Setter
    @Getter
    private short nameIndex;

    @Override
    public String toString() {
        return "CONSTANT_Class{" +
                "nameIndex=" + nameIndex +
                ", tag=" + tag2String(tag) +
                '}';
    }
}
