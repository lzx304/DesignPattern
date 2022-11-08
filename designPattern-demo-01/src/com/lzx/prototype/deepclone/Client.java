package com.lzx.prototype.deepclone;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/16 16:31:58
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");
        //方式 1 完成深拷贝
         //DeepProtoType p2 = (DeepProtoType) p.clone();

         //System.out.println("p.name=" + p.name + p.name.hashCode() + ",p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
         //System.out.println("p2.name=" + p2.name + p2.name.hashCode() +  ",p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
        //方式 2 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepClone();
        System.out.println("p.name=" + p.name + ",p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p2.name  + ",p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

    }
}
