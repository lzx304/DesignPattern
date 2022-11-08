package com.lzx.mediator.smarthouse;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 16:07:53
 */
public class CoffeeMachine extends  Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        // TODO Auto-generated constructor stub
        mediator.Register(name, this);
    }
    @Override
    public void SendMessage(int stateChange) {
// TODO Auto-generated method stub
        this.GetMediator().GetMessage(stateChange, this.name);
    }
    public void StartCoffee() {
        System.out.println("It's time to startcoffee!");
    }
    public void FinishCoffee() {
        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        SendMessage(0);
    }
}
