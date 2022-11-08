package com.lzx.visitor;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 18:32:19
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
// TODO Auto-generated method stub
        action.getManResult(this);
    }
}
