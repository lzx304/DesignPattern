package com.lzx.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 22:18:45
 */
public class InfoCollege implements College {
    List<Department> departmentList;
    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全专业", " 信息安全专业 ");
        addDepartment("网络安全专业", " 网络安全专业 ");
        addDepartment("服务器安全专业", " 服务器安全专业 ");
    }
    @Override
    public String getName() {
// TODO Auto-generated method stub
        return "信息工程学院";
    }
    @Override
    public void addDepartment(String name, String desc) {
// TODO Auto-generated method stub
        Department department = new Department(name, desc);
        departmentList.add(department);
    }
    @Override
    public Iterator createIterator() {
// TODO Auto-generated method stub
        return new InfoColleageIterator(departmentList);
    }
}
