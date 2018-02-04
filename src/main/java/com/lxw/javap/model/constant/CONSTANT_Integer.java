package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

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
}
