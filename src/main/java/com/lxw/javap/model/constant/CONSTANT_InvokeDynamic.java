package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class CONSTANT_InvokeDynamic extends CpInfo {
    @Setter
    @Getter
    private short bootstrapMethodAttrIndex;

    @Getter
    @Setter
    private short nameAndTypeIndex;

    @Override
    public String toString() {
        return "CONSTANT_InvokeDynamic{" +
                "bootstrapMethodAttrIndex=" + bootstrapMethodAttrIndex +
                ", nameAndTypeIndex=" + nameAndTypeIndex +
                ", tag=" + tag2String(tag) +
                '}';
    }
}
