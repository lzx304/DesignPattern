package com.lzx.iterator;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 22:13:12
 */
public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //创建学院
        List<College> collegeList = new ArrayList<College>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        //collegeList.add(infoCollege);
        OutPutImpl outPutImpl = new OutPutImpl(collegeList);
        outPutImpl.printCollege();
    }
}
