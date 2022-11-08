package com.lzx.facade;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/1 22:31:56
 */
public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //这里直接调用。。 很麻烦
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();


        homeTheaterFacade.end();
    }
}
