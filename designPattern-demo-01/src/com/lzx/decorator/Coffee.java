package com.lzx.decorator;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/30 16:57:45
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
// TODO Auto-generated method stub
        return super.getPrice();
    }
}