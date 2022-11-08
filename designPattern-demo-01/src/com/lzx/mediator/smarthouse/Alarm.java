package com.lzx.mediator.smarthouse;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 16:03:05
 */
//具体的同事类
public class Alarm extends Colleague {
    //构造器
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
// TODO Auto-generated constructor stub
//在创建 Alarm 同事对象时，将自己放入到 ConcreteMediator 对象中[集合]
        mediator.Register(name, this);
    }
    public void SendAlarm(int stateChange) {
        SendMessage(stateChange);
    }
    @Override
    public void SendMessage(int stateChange) {
// TODO Auto-generated method stub
//调用的中介者对象的 getMessage
        this.GetMediator().GetMessage(stateChange, this.name);
    }
}
