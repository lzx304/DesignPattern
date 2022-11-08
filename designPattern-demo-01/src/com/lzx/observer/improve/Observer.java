package com.lzx.observer.improve;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/5 22:48:04
 */
//观察者接口，有观察者来实现
public interface Observer {
    public void update(float temperature, float pressure, float humidity);
}
