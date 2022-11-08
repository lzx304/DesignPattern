package com.lzx.mediator.smarthouse;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 16:09:33
 */
public abstract class Mediator {
    //将给中介者对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);
    //接收消息, 具体的同事对象发出
    public abstract void GetMessage(int stateChange, String colleagueName);
    public abstract void SendMessage();
}
