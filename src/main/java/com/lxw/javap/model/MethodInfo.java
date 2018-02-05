package com.lxw.javap.model;

import com.lxw.javap.model.accessflags.MethodAccessFlags;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

import static com.lxw.javap.util.StringUtils.fastSpaceString;

@Builder
public class MethodInfo {
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
        return "MethodInfo{" +
                "accessFlags=" + MethodAccessFlags.outputAccessFlags(accessFlags) +
                ", nameIndex=" + nameIndex +
                ", descriptorIndex=" + descriptorIndex +
                ", attributesCount=" + attributesCount +
                ", attributeInfos=" + Arrays.toString(attributeInfos) +
                '}';
    }

    public String prettyString(int beginSpace) {
        return fastSpaceString(beginSpace) + "MethodInfo{" + "\n" +
                fastSpaceString(beginSpace + 4) +
                "accessFlags=" + MethodAccessFlags.outputAccessFlags(accessFlags) + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "nameIndex=" + nameIndex + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "descriptorIndex=" + descriptorIndex + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "attributesCount=" + attributesCount + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "attributeInfos=" + Arrays.toString(attributeInfos) + "\n" +
                fastSpaceString(beginSpace) + '}';
    }
}
