package com.lxw.javap.model.attributes;

import com.lxw.javap.model.AbstractAtrributeInfo;
import com.lxw.javap.model.AttributeInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Builder
public class Code extends AbstractAtrributeInfo {
    @Getter
    @Setter
    private short attributeNameIndex;
    @Getter
    @Setter
    private int attributeLength;
    @Getter
    @Setter
    private short maxStack;
    @Getter
    @Setter
    private short maxLocals;
    @Getter
    @Setter
    private int codeLength;
    @Getter
    @Setter
    private byte[] code;
    @Getter
    @Setter
    private short exceptionTableLength;
    @Getter
    @Setter
    private ExceptionInfo[] exceptionTable;
    @Getter
    @Setter
    private short attributesCount;
    @Getter
    @Setter
    private AbstractAtrributeInfo[] attributeInfos;

    @Override
    public String toString() {
        return "Code{" +
                "attributeNameIndex=" + attributeNameIndex +
                ", attributeLength=" + attributeLength +
                ", maxStack=" + maxStack +
                ", maxLocals=" + maxLocals +
                ", codeLength=" + codeLength +
                ", code=" + Arrays.toString(code) +
                ", exceptionTableLength=" + exceptionTableLength +
                ", exceptionTable=" + Arrays.toString(exceptionTable) +
                ", attributesCount=" + attributesCount +
                ", attributeInfos=" + Arrays.toString(attributeInfos) +
                '}';
    }
}
