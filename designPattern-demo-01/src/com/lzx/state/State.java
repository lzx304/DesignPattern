package com.lzx.state;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 17:41:54
 */
/**
 * 状态抽象类
 * @author Administrator
 *
 */
public abstract class State {
    // 扣除积分 - 50
    public abstract void deductMoney();
    // 是否抽中奖品
    public abstract boolean raffle();
    // 发放奖品
    public abstract void dispensePrize();

}
