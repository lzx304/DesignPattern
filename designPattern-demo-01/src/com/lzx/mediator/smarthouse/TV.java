package com.lzx.mediator.smarthouse;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 16:12:01
 */
public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        // TODO Auto-generated constructor stub
        mediator.Register(name, this);
    }
    @Override
    public void SendMessage(int stateChange) {
// TODO Auto-generated method stub
        this.GetMediator().GetMessage(stateChange, this.name);
    }
    public void StartTv() {
// TODO Auto-generated method stub
        System.out.println("It's time to StartTv!");
    }
    public void StopTv() {
// TODO Auto-generated method stub
        System.out.println("StopTv!");
    }
}
