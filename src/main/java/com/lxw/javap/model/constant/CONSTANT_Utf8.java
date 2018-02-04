package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.nio.charset.Charset;

@Builder
public class CONSTANT_Utf8 extends CpInfo {
//    @Getter
//    @Setter
//    private short length;
//
//    @Setter
//    @Getter
//    private byte[] bytes;
//
//    @Override
//    public String toString() {
//        return "CONSTANT_Utf8{" +
//                "length=" + length +
//                ", bytes=" + new String(bytes, Charset.forName("utf-8")) +
//                ", tag=" + tag2String(tag) +
//                '}';
//    }

    @Getter
    @Setter
    private short length;

    @Setter
    @Getter
    private String utf8String;

    @Override
    public String toString() {
        return "CONSTANT_Utf8{" +
                "length=" + length +
                ", utf8String='" + utf8String + '\'' +
                ", tag=" + tag2String(tag) +
                '}';
    }
}
