package com.lxw.javap.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Builder
public class AttributeInfo extends AbstractAtrributeInfo {
    @Getter
    @Setter
    private short attributeNameIndex;
    @Getter
    @Setter
    private int attributeLength;
    @Getter
    @Setter
    private byte[] bytes;

    @Override
    public String toString() {
        return "AttributeInfo{" +
                "attributeNameIndex=" + attributeNameIndex +
                ", attributeLength=" + attributeLength +
                ", bytes=" + Arrays.toString(bytes) +
                '}';
    }
}
