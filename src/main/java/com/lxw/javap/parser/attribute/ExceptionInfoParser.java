package com.lxw.javap.parser.attribute;

import com.lxw.javap.model.attributes.ExceptionInfo;

import java.io.DataInputStream;
import java.io.IOException;

public class ExceptionInfoParser {
    public static ExceptionInfo[] parserExceptionInfoArrays(DataInputStream dataInputStream, int length) throws IOException {
        ExceptionInfo[] exceptionInfos = new ExceptionInfo[length];
        for(int i = 0;i < length;i++) {
            exceptionInfos[i] = parserExceptionInfo(dataInputStream);
        }
        return exceptionInfos;
    }

    public static ExceptionInfo parserExceptionInfo(DataInputStream dataInputStream) throws IOException {
        short startPc = dataInputStream.readShort();
        short endPc = dataInputStream.readShort();
        short handlerPc = dataInputStream.readShort();
        short catchType = dataInputStream.readShort();
        ExceptionInfo exceptionInfo = ExceptionInfo.builder().startPc(startPc).endPc(endPc).handlerPc(handlerPc).catchType(catchType).build();
        return exceptionInfo;
    }
}
