package com.lzx.command;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 18:09:08
 */
public class TVOnCommand implements Command {
    // 聚合 TVReceiver
    TVReceiver tv;
    // 构造器
    public TVOnCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }
    @Override
    public void execute() {
// TODO Auto-generated method stub
// 调用接收者的方法
        tv.on();
    }
    @Override
    public void undo() {
// TODO Auto-generated method stub
// 调用接收者的方法
        tv.off();
    }
}
