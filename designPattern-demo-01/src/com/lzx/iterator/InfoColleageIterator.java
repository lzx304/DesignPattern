package com.lzx.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 22:17:35
 */
public class InfoColleageIterator implements Iterator {

    List<Department> departmentList; // 信息工程学院是以 List 方式存放系
    int index = -1;//索引
    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }
    //判断 list 中还有没有下一个元素
    @Override
    public boolean hasNext() {
// TODO Auto-generated method stub
        if(index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }
    @Override
    public Object next() {
// TODO Auto-generated method stub
        return departmentList.get(index);
    }
    //空实现 remove
    public void remove() {
    }
}
