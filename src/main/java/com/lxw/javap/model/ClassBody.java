package com.lxw.javap.model;

import com.lxw.javap.model.accessflags.ClassAccessFlags;
import com.lxw.javap.util.StringUtils;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

import static com.lxw.javap.util.StringUtils.fastSpaceString;

@Builder
public class ClassBody {
    @Getter
    @Setter
    private int magic;

    @Getter
    @Setter
    private short minorVersion;

    @Getter
    @Setter
    private short majorVersion;

    @Getter
    @Setter
    private short constantPoolCount;

    @Getter
    @Setter
    private CpInfo[] cpInfos;

    @Getter
    @Setter
    private short accessFlag;

    @Getter
    @Setter
    private short thisClass;

    @Getter
    @Setter
    private short superClass;

    @Getter
    @Setter
    private short interfacesCount;

    @Getter
    @Setter
    private short[] interfaces;

    @Getter
    @Setter
    private short fieldsCount;

    @Getter
    @Setter
    private FieldInfo[] fieldInfos;

    @Getter
    @Setter
    private short methodsCount;

    @Getter
    @Setter
    private MethodInfo[] methodInfos;

    @Getter
    @Setter
    private short attributesCount;

    @Getter
    @Setter
    private AbstractAtrributeInfo[] attributeInfos;

    @Override
    public String toString() {
        return "ClassBody{" +
                "magic=" + Integer.toHexString(magic) +
                ", minorVersion=" + minorVersion +
                ", majorVersion=" + majorVersion +
                ", constantPoolCount=" + constantPoolCount +
                ", cpInfos=" + StringUtils.arraysToString(cpInfos, ",\n", true) +
                ", accessFlag=" + ClassAccessFlags.outputAccessFlags(accessFlag) +
                ", thisClass=" + thisClass +
                ", superClass=" + superClass +
                ", interfacesCount=" + interfacesCount +
                ", interfaces=" + Arrays.toString(interfaces) +
                ", fieldsCount=" + fieldsCount +
                ", fieldInfos=" + StringUtils.arraysToString(fieldInfos, ",\n", false) +
                ", methodsCount=" + methodsCount +
                ", methodInfos=" + StringUtils.arraysToString(methodInfos, ",\n", false) +
                ", attributesCount=" + attributesCount +
                ", attributeInfos=" + Arrays.toString(attributeInfos) +
                '}';
    }

    public String prettyString(int beginSpace) {
        return fastSpaceString(beginSpace) + "ClassBody{" + "\n" +
                fastSpaceString(beginSpace + 4) +
                "magic=" + Integer.toHexString(magic) + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "minorVersion=" + minorVersion + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "majorVersion=" + majorVersion + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "constantPoolCount=" + constantPoolCount + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "cpInfos=[\n" + StringUtils.arraysToString(cpInfos, ",\n", false, (Object cpInfo) -> ((CpInfo)cpInfo).prettyString(beginSpace + 4 + 4)) + "\n" +
                fastSpaceString(beginSpace + 4) +
                "],\n" +
                fastSpaceString(beginSpace + 4) +
                "accessFlag=" + ClassAccessFlags.outputAccessFlags(accessFlag) + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "thisClass=" + thisClass + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "superClass=" + superClass + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "interfacesCount=" + interfacesCount + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "interfaces=" + Arrays.toString(interfaces) + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "fieldsCount=" + fieldsCount + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "fieldInfos=[\n" + StringUtils.arraysToString(fieldInfos, ",\n", false, (Object fieldInfo) -> ((FieldInfo)fieldInfo).prettyString(beginSpace + 4 + 4)) + "\n" +
                fastSpaceString(beginSpace + 4) +
                "],\n" +
                fastSpaceString(beginSpace + 4) +
                "methodsCount=" + methodsCount + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "methodInfos=[\n" + StringUtils.arraysToString(methodInfos, ",\n", false, (Object methodInfo) -> ((MethodInfo)methodInfo).prettyString(beginSpace + 4 + 4)) + "\n" +
                fastSpaceString(beginSpace + 4) +
                "],\n" +
                fastSpaceString(beginSpace + 4) +
                "attributesCount=" + attributesCount + ",\n" +
                fastSpaceString(beginSpace + 4) +
                "attributeInfos=" + Arrays.toString(attributeInfos) + "\n" +
                fastSpaceString(beginSpace) + '}';
    }
}
