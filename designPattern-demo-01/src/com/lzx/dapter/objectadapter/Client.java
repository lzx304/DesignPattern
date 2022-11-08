package com.lzx.dapter.objectadapter;
/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/30 14:57:22
 */
public class Client {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
        System.out.println(" === 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
