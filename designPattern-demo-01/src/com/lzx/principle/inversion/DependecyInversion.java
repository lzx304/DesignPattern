package com.lzx.principle.inversion;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/8 22:20:38
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}
//定义接口
interface IReceiver {
    String getInfo();
}
class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}
//增加微信
class WeiXin implements IReceiver {
    @Override
    public String getInfo() {
        return "微信信息: hello,ok";
    }
}
//方式 2
class Person {
    //这里我们是对接口的依赖
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}