package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import static com.lxw.javap.util.StringUtils.fastSpaceString;

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

    @Override
    public String prettyString(int beginSpace) {
        return fastSpaceString(beginSpace) + "CONSTANT_MethodType{" + "\n" +
                fastSpaceString(beginSpace + 4) +
                "descriptorIndex=" + descriptorIndex + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "tag=" + tag2String(tag) + "\n" +
                fastSpaceString(beginSpace) + '}';
    }
}
