package com.lzx.command;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 18:01:16
 */
public interface Command {
    //执行动作(操作)
    public void execute();
    //撤销动作(操作)
    public void undo();
}
