package com.lzx.bridge;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/30 16:32:15
 */
public class Vivo implements Brand {
    @Override
    public void open() {
// TODO Auto-generated method stub
        System.out.println(" Vivo 手机开机 ");
    }
    @Override
    public void close() {
// TODO Auto-generated method stub
        System.out.println(" Vivo 手机关机 ");
    }
    @Override
    public void call() {
// TODO Auto-generated method stub
        System.out.println(" Vivo 手机打电话 ");
    }
}
