package com.lzx.singleton.type1;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/9 18:15:08
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

//饿汉式(静态变量)
class Singleton {

    //1) 构造器私有化 (防止 new )
    private Singleton(){}

    //2) 类的内部创建对象
    private final static Singleton instance = new Singleton();

    //3) 向外暴露一个静态的公共方法。getInstance
    public static Singleton getInstance(){
        return instance;
    }


}