package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class CONSTANT_Fieldref extends CpInfo {
    @Setter
    @Getter
    private short classIndex;

    @Setter
    @Getter
    private short nameAndTypeIndex;

    @Override
    public String toString() {
        return "CONSTANT_Fieldref{" +
                "classIndex=" + classIndex +
                ", nameAndTypeIndex=" + nameAndTypeIndex +
                ", tag=" + tag2String(tag) +
                '}';
    }
}
