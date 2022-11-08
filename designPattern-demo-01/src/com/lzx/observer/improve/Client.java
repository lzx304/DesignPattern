package com.lzx.observer.improve;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 22:49:38
 */
public class Client {
    public static void main(String[] args) {
// TODO Auto-generated method stub
//创建一个 WeatherData
        WeatherData weatherData = new WeatherData();
//创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();
//注册到 weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);
//测试
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setData(10f, 100f, 30.3f);
        weatherData.removeObserver(currentConditions);
//测试
        System.out.println();
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setData(10f, 100f, 30.3f);
    }
}
