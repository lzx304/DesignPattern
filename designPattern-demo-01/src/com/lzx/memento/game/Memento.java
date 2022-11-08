package com.lzx.memento.game;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 16:34:46
 */
public class Memento {
    //攻击力
    private int vit;
    //防御力
    private int def;
    public Memento(int vit, int def) {
        super();
        this.vit = vit;
        this.def = def;
    }
    public int getVit() {
        return vit;
    }
    public void setVit(int vit) {
        this.vit = vit;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }
}
