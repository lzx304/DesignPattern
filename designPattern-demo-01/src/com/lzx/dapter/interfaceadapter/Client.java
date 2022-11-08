package com.lzx.dapter.interfaceadapter;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/30 15:16:58
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            //只需要去覆盖我们 需要使用 接口方法
            @Override
            public void m1() {
                // TODO Auto-generated method stub
                System.out.println("使用了 m1 的方法");
            }
        };
        absAdapter.m1();
    }
}
