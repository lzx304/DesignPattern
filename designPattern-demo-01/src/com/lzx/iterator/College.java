package com.lzx.iterator;

import java.util.Iterator;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 22:13:43
 */
public interface College {
    public String getName();
    //增加系的方法
    public void addDepartment(String name, String desc);
    //返回一个迭代器,遍历
    public Iterator createIterator();
}
