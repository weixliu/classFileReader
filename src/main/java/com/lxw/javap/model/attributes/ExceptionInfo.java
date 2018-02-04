package com.lxw.javap.model.attributes;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class ExceptionInfo {
    @Getter
    @Setter
    private short startPc;
    @Getter
    @Setter
    private short endPc;
    @Getter
    @Setter
    private short handlerPc;
    @Getter
    @Setter
    private short catchType;

    @Override
    public String toString() {
        return "ExceptionInfo{" +
                "startPc=" + startPc +
                ", endPc=" + endPc +
                ", handlerPc=" + handlerPc +
                ", catchType=" + catchType +
                '}';
    }
}
