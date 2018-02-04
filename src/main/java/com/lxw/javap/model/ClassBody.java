package com.lxw.javap.model;

import com.lxw.javap.model.accessflags.ClassAccessFlags;
import com.lxw.javap.util.StringUtils;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

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
                ", cpInfos=" + StringUtils.arrysToString(cpInfos, '\n', true) +
                ", accessFlag=" + ClassAccessFlags.outputAccessFlags(accessFlag) +
                ", thisClass=" + thisClass +
                ", superClass=" + superClass +
                ", interfacesCount=" + interfacesCount +
                ", interfaces=" + Arrays.toString(interfaces) +
                ", fieldsCount=" + fieldsCount +
                ", fieldInfos=" + StringUtils.arrysToString(fieldInfos, '\n', false) +
                ", methodsCount=" + methodsCount +
                ", methodInfos=" + StringUtils.arrysToString(methodInfos, '\n', false) +
                ", attributesCount=" + attributesCount +
                ", attributeInfos=" + Arrays.toString(attributeInfos) +
                '}';
    }
}
