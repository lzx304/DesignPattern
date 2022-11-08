package com.lzx.visitor;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 18:30:57
 */
public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //创建 ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        //成功
        Success success = new Success();
        objectStructure.display(success);
        System.out.println("===============");
        Fail fail = new Fail();
        objectStructure.display(fail);
        System.out.println("=======给的是待定的测评========");
        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}
