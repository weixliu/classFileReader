package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import static com.lxw.javap.util.StringUtils.fastSpaceString;

@Builder
public class CONSTANT_Double extends CpInfo {
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
//        return "CONSTANT_Double{" +
//                "high4Bytes=" + high4Bytes +
//                ", low4Bytes=" + low4Bytes +
//                ", tag=" + tag2String(tag) +
//                '}';
//    }

    @Setter
    @Getter
    private double doubleValue;


    @Override
    public String toString() {
        return "CONSTANT_Double{" +
                "doubleValue=" + doubleValue +
                ", tag=" + tag2String(tag) +
                '}';
    }

    @Override
    public String prettyString(int beginSpace) {
        return fastSpaceString(beginSpace) + "CONSTANT_Double{" + "\n" +
                fastSpaceString(beginSpace + 4) +
                "doubleValue=" + doubleValue +  ",\n" +
                fastSpaceString(beginSpace + 4) +
                "tag=" + tag2String(tag) + "\n" +
                fastSpaceString(beginSpace) + '}';
    }
}
