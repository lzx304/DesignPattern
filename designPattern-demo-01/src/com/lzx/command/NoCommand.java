package com.lzx.command;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 18:05:54
 */
/**
 * 没有任何命令，即空执行: 用于初始化每个按钮, 当调用空命令时，对象什么都不做
 * 其实，这样是一种设计模式, 可以省掉对空判断
*/
public class NoCommand implements Command {
    @Override
    public void execute() {
// TODO Auto-generated method stub
    }

    @Override
    public void undo() {
// TODO Auto-generated method stub
    }
}
