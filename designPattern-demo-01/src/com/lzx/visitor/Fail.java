package com.lzx.visitor;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 18:31:33
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
// TODO Auto-generated method stub
        System.out.println(" 男人给的评价该歌手失败 !");
    }
    @Override
    public void getWomanResult(Woman woman) {
// TODO Auto-generated method stub
        System.out.println(" 女人给的评价该歌手失败 !");
    }
}
