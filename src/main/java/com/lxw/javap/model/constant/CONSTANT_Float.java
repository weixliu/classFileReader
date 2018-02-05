package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import static com.lxw.javap.util.StringUtils.fastSpaceString;

@Builder
public class CONSTANT_Float extends CpInfo {
    @Setter
    @Getter
    private float floatValue;

    @Override
    public String toString() {
        return "CONSTANT_Float{" +
                "bytes=" + floatValue +
                ", tag=" + tag2String(tag) +
                '}';
    }

    @Override
    public String prettyString(int beginSpace) {
        return fastSpaceString(beginSpace) + "CONSTANT_Float{" + "\n" +
                fastSpaceString(beginSpace + 4) +
                "bytes=" + floatValue +  ",\n" +
                fastSpaceString(beginSpace + 4) +
                "tag=" + tag2String(tag) + "\n" +
                fastSpaceString(beginSpace) + '}';
    }
}
