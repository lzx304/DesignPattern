package com.lzx.strategy.improve;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 22:09:29
 */
public class PekingDuck extends Duck {
    //假如北京鸭可以飞翔，但是飞翔技术一般
    public PekingDuck() {
// TODO Auto-generated constructor stub
        flyBehavior = new BadFlyBehavior();
    }
    @Override
    public void display() {
// TODO Auto-generated method stub
        System.out.println("~~北京鸭~~~");
    }
}
