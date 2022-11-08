package com.lzx.iterator;

import java.util.Iterator;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 22:14:08
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0 ;// 保存当前数组的对象个数
    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java 专业", " Java 专业 ");
        addDepartment("PHP 专业", " PHP 专业 ");
        addDepartment("大数据专业", " 大数据专业 ");
    }

    @Override
    public String getName() {
// TODO Auto-generated method stub
        return "计算机学院";
    }
    @Override
    public void addDepartment(String name, String desc) {
// TODO Auto-generated method stub
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }
    @Override
    public Iterator createIterator() {
// TODO Auto-generated method stub
        return new ComputerCollegeIterator(departments);
    }
}
