package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import static com.lxw.javap.util.StringUtils.fastSpaceString;

@Builder
public class CONSTANT_Integer extends CpInfo {
    @Setter
    @Getter
    private int intValue;

    @Override
    public String toString() {
        return "CONSTANT_Integer{" +
                "bytes=" + intValue +
                ", tag=" + tag2String(tag) +
                '}';
    }

    @Override
    public String prettyString(int beginSpace) {
        return fastSpaceString(beginSpace) + "CONSTANT_Integer{" + "\n" +
                fastSpaceString(beginSpace + 4) +
                "bytes=" + intValue +  ",\n" +
                fastSpaceString(beginSpace + 4) +
                "tag=" + tag2String(tag) + "\n" +
                fastSpaceString(beginSpace) + '}';
    }
}
