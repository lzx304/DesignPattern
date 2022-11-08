package com.lzx.singleton.type8;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/9 22:59:30
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton8 instance = Singleton8.INSTANCE;
        Singleton8 instance2 = Singleton8.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        instance.sayOK();

    }
}

//使用枚举，可以实现单例, 推荐
enum Singleton8 {

    INSTANCE; //属性

    public void sayOK() {
        System.out.println("ok~");
    }
}
