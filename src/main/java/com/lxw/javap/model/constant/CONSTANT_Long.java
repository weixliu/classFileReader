package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import static com.lxw.javap.util.StringUtils.fastSpaceString;

@Builder
public class CONSTANT_Long extends CpInfo {
//    @Setter
//    @Getter
//    private int high4Bytes;
//
//    @Setter
//    @Getter
//    private int low4Bytes;
//
//    @Override
//    public String toString() {
//        return "CONSTANT_Long{" +
//                "high4Bytes=" + high4Bytes +
//                ", low4Bytes=" + low4Bytes +
//                ", tag=" + tag2String(tag) +
//                '}';
//    }

    @Setter
    @Getter
    private long longValue;


    @Override
    public String toString() {
        return "CONSTANT_Long{" +
                "longValue=" + longValue +
                ", tag=" + tag2String(tag) +
                '}';
    }

    @Override
    public String prettyString(int beginSpace) {
        return fastSpaceString(beginSpace) + "CONSTANT_Long{" + "\n" +
                fastSpaceString(beginSpace + 4) +
                "longValue=" + longValue + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "tag=" + tag2String(tag) + "\n" +
                fastSpaceString(beginSpace) + '}';
    }
}
