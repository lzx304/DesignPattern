package com.lzx.memento.theory;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 16:25:03
 */
public class Memento {
    private String state;
    //构造器
    public Memento(String state) {
        super();
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
