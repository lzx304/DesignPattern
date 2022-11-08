package com.lzx.strategy;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 18:35:39
 */
public class PekingDuck extends Duck {
    @Override
    public void display() {
// TODO Auto-generated method stub
        System.out.println("~~北京鸭~~~");
    }
    //因为北京鸭不能飞翔，因此需要重写 fly
    @Override
    public void fly() {
// TODO Auto-generated method stub
        System.out.println("北京鸭不能飞翔");
    }
}
