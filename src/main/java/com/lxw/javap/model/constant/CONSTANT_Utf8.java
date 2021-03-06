package com.lxw.javap.model.constant;

import com.lxw.javap.model.CpInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.nio.charset.Charset;

import static com.lxw.javap.util.StringUtils.fastSpaceString;

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

    @Override
    public String prettyString(int beginSpace) {
        return fastSpaceString(beginSpace) + "CONSTANT_Utf8{" + "\n" +
                fastSpaceString(beginSpace + 4) +
                "length=" + length + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "utf8String='" + utf8String + '\'' + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "tag=" + tag2String(tag) + "\n" +
                fastSpaceString(beginSpace) + '}';
    }
}
