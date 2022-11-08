package com.lzx.strategy.improve;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 22:08:57
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
// TODO Auto-generated method stub
        System.out.println(" 不会飞翔 ");
    }
}
