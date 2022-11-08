package com.lzx.proxy.cglib;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 17:18:38
 */
public class TeacherDao {
    public String teach() {
        System.out.println(" 老师授课中 ， 我是 cglib 代理，不需要实现接口 ");
        return "hello";
    }
}
