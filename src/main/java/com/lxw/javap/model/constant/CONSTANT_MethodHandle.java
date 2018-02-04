package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class CONSTANT_MethodHandle extends CpInfo {
    @Getter
    @Setter
    private byte referenceKind;

    @Getter
    @Setter
    private short referenceIndex;

    @Override
    public String toString() {
        return "CONSTANT_MethodHandle{" +
                "referenceKind=" + referenceKind +
                ", referenceIndex=" + referenceIndex +
                ", tag=" + tag2String(tag) +
                '}';
    }
}
