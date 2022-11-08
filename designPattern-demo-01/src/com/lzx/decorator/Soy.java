package com.lzx.decorator;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/30 17:06:18
 */
public class Soy extends Decorator{
    public Soy(Drink obj) {
        super(obj);
// TODO Auto-generated constructor stub
        setDes(" 豆浆 ");
        setPrice(1.5f);
    }
}
