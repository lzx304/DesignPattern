package com.lzx.memento.game;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 16:32:58
 */
//守护者对象, 保存游戏角色的状态
public class Caretaker {
    //如果只保存一次状态
    private Memento memento;
    //对 GameRole 保存多次状态
//private ArrayList<Memento> mementos;
//对多个游戏角色保存多个状态
//private HashMap<String, ArrayList<Memento>> rolesMementos;
    public Memento getMemento() {
        return memento;
    }
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}