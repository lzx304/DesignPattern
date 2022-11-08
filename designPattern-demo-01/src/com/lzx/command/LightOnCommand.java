package com.lzx.command;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 18:03:20
 */
public class LightOnCommand implements Command {
    //聚合 LightReceiver
    LightReceiver light;

    //构造器
    public LightOnCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
    // TODO Auto-generated method stub
    //调用接收者的方法
        light.on();
    }

    @Override
    public void undo() {
    // TODO Auto-generated method stub
        //调用接收者的方法
        light.off();
    }
}
