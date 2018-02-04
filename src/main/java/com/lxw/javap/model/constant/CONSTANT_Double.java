package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

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
}
