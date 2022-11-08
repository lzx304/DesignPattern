package com.lzx.decorator;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/30 17:04:49
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
// TODO Auto-generated constructor stub
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }
}
