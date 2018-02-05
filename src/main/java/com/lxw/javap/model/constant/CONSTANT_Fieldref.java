package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import static com.lxw.javap.util.StringUtils.fastSpaceString;

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

    @Override
    public String prettyString(int beginSpace) {
        return fastSpaceString(beginSpace) + "CONSTANT_Fieldref{" + "\n" +
                fastSpaceString(beginSpace + 4) +
                "classIndex=" + classIndex + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "nameAndTypeIndex=" + nameAndTypeIndex + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "tag=" + tag2String(tag) + "\n" +
                fastSpaceString(beginSpace) + '}';
    }
}
