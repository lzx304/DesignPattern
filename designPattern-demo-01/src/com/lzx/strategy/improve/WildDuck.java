package com.lzx.strategy.improve;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 22:11:09
 */
public class WildDuck extends Duck {
    //构造器，传入 FlyBehavor 的对象
    public WildDuck() {
// TODO Auto-generated constructor stub
        flyBehavior = new GoodFlyBehavior();
    }
    @Override
    public void display() {
// TODO Auto-generated method stub
        System.out.println(" 这是野鸭 ");
    }
}
