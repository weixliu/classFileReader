package com.lxw.javap.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Builder
public class FieldInfo {
    @Getter
    @Setter
    private short accessFlags;
    @Getter
    @Setter
    private short nameIndex;
    @Getter
    @Setter
    private short descriptorIndex;
    @Getter
    @Setter
    private short attributesCount;
    @Getter
    @Setter
    private AbstractAtrributeInfo[] attributeInfos;

    @Override
    public String toString() {
        return "FieldInfo{" +
                "accessFlags=" + accessFlags +
                ", nameIndex=" + nameIndex +
                ", descriptorIndex=" + descriptorIndex +
                ", attributesCount=" + attributesCount +
                ", attributeInfos=" + Arrays.toString(attributeInfos) +
                '}';
    }
}
