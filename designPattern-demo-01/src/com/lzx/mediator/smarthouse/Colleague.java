package com.lzx.mediator.smarthouse;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 16:08:06
 */
public abstract class Colleague {
    private Mediator mediator;
    public String name;
    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    public Mediator GetMediator() {
        return this.mediator;
    }
    public abstract void SendMessage(int stateChange);
}
