package com.lzx.singleton.type3;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/9 18:29:11
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("懒汉式 1 ， 线程不安全~");
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}


class Singleton3 {
    //1. 构造器私有化, 外部能 new
    private Singleton3() {
    }

    //2.本类内部创建对象实例
    private static Singleton3 instance;

    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton3 getInstance() {
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}