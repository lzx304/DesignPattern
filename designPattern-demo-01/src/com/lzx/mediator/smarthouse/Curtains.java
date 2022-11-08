package com.lzx.mediator.smarthouse;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 16:11:09
 */
public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
// TODO Auto-generated constructor stub
        mediator.Register(name, this);
    }
    @Override
    public void SendMessage(int stateChange) {
// TODO Auto-generated method stub
        this.GetMediator().GetMessage(stateChange, this.name);
    }
    public void UpCurtains() {
        System.out.println("I am holding Up Curtains!");
    }
}