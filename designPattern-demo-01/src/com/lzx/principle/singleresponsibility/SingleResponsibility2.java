package com.lzx.principle.singleresponsibility;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/8 18:36:58
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}
//方案 2 的分析
//1. 遵守单一职责原则
//2. 但是这样做的改动很大，即将类分解，同时修改客户端
//3. 改进：直接修改 Vehicle 类，改动的代码会比较少=>方案 3
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
}
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
}
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "水中运行");
    }
}