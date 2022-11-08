package com.lzx.builder.improve;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/16 18:00:05
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
// TODO Auto-generated method stub
        System.out.println(" 普通房子打地基 5 米 ");
    }
    @Override
    public void buildWalls() {
// TODO Auto-generated method stub
        System.out.println(" 普通房子砌墙 10cm ");
    }
    @Override
    public void roofed() {
// TODO Auto-generated method stub
        System.out.println(" 普通房子屋顶 ");
    }
}
