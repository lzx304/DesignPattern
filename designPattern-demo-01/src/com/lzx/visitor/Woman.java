package com.lzx.visitor;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 18:32:35
 */
//说明
//1. 这里我们使用到了双分派, 即首先在客户端程序中，将具体状态作为参数传递 Woman 中(第一次分派)
//2. 然后 Woman 类调用作为参数的 "具体方法" 中方法 getWomanResult, 同时将自己(this)作为参数
// 传入，完成第二次的分派
public class Woman extends Person{
    @Override
    public void accept(Action action) {
// TODO Auto-generated method stub
        action.getWomanResult(this);
    }
}
