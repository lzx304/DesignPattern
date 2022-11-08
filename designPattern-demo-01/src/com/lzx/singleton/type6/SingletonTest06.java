package com.lzx.singleton.type6;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/9 18:40:38
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

// 懒汉式(线程安全，同步方法)
class Singleton6 {
    private static volatile Singleton6 instance;

    private Singleton6() {
    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    //同时保证了效率, 推荐使用
    public static synchronized Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class){
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}