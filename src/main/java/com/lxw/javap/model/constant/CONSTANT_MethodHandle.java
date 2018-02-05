package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import static com.lxw.javap.util.StringUtils.fastSpaceString;

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

    @Override
    public String prettyString(int beginSpace) {
        return fastSpaceString(beginSpace) + "CONSTANT_MethodHandle{" + "\n" +
                fastSpaceString(beginSpace + 4) +
                "referenceKind=" + referenceKind +  ",\n" +
                fastSpaceString(beginSpace + 4) +
                "referenceIndex=" + referenceIndex + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "tag=" + tag2String(tag) + "\n" +
                fastSpaceString(beginSpace) + '}';
    }
}
