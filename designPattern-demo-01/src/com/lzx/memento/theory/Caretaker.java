package com.lzx.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 16:23:46
 */
public class Caretaker {
    //在 List 集合中会有很多的备忘录对象
    private List<Memento> mementoList = new ArrayList<Memento>();
    public void add(Memento memento) {
        mementoList.add(memento);
    }
    //获取到第 index 个 Originator 的 备忘录对象(即保存状态)
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
