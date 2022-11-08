package com.lzx.bridge;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/30 16:31:11
 */
public class UpRightPhone extends Phone {
    //构造器
    public UpRightPhone(Brand brand) {
        super(brand);
    }
    public void open() {
        super.open();
        System.out.println(" 直立样式手机 ");
    }
    public void close() {
        super.close();
        System.out.println(" 直立样式手机 ");
    }
    public void call() {
        super.call();
        System.out.println(" 直立样式手机 ");
    }
}
