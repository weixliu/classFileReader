package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import static com.lxw.javap.util.StringUtils.fastSpaceString;

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

    @Override
    public String prettyString(int beginSpace) {
        return fastSpaceString(beginSpace) + "CONSTANT_String{" + "\n" +
                fastSpaceString(beginSpace + 4) +
                "stringIndex=" + stringIndex + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "tag=" + tag2String(tag) + "\n" +
                fastSpaceString(beginSpace) + '}';
    }
}
