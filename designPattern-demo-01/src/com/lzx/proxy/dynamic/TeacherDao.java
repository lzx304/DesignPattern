package com.lzx.proxy.dynamic;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/1 23:29:49
 */
public class TeacherDao implements ITeacherDao  {

    @Override
    public void teach() {
        // TODO Auto-generated method stub
        System.out.println(" 老师授课中.... ");
    }
    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
