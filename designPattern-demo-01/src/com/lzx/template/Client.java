package com.lzx.template;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 17:39:16
 */
public class Client {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    // 制作红豆豆浆
         System.out.println("----制作红豆豆浆----");
         SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
         redBeanSoyaMilk.make();
         System.out.println("----制作花生豆浆----");
         SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
         peanutSoyaMilk.make();

    }
}
