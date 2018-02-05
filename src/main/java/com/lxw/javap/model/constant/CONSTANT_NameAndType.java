package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import static com.lxw.javap.util.StringUtils.fastSpaceString;

@Builder
public class CONSTANT_NameAndType extends CpInfo {
    @Setter
    @Getter
    private short nameIndex;

    @Setter
    @Getter
    private short descriptorIndex;

    @Override
    public String toString() {
        return "CONSTANT_NameAndType{" +
                "nameIndex=" + nameIndex +
                ", descriptorIndex=" + descriptorIndex +
                ", tag=" + tag2String(tag) +
                '}';
    }

    @Override
    public String prettyString(int beginSpace) {
        return fastSpaceString(beginSpace) + "CONSTANT_NameAndType{" + "\n" +
                fastSpaceString(beginSpace + 4) +
                "nameIndex=" + nameIndex + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "descriptorIndex=" + descriptorIndex + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "tag=" + tag2String(tag) + "\n" +
                fastSpaceString(beginSpace) + '}';
    }
}
