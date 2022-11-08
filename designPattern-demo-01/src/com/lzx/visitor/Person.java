package com.lzx.visitor;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 18:32:12
 */
public abstract class Person {
    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
