package com.lzx.strategy.improve;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 22:10:16
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
// TODO Auto-generated constructor stub
        flyBehavior = new NoFlyBehavior();
    }
    @Override
    public void display() {
// TODO Auto-generated method stub
        System.out.println("玩具鸭");
    }
    //需要重写父类的所有方法
    public void quack() {
        System.out.println("玩具鸭不能叫~~");
    }
    public void swim() {
        System.out.println("玩具鸭不会游泳~~");
    }
}
