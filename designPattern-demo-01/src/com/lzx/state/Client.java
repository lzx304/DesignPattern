package com.lzx.state;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 17:35:16
 */
public class Client {
    public static void main(String[] args) {
// TODO Auto-generated method stub
// 创建活动对象，奖品有 1 个奖品
        RaffleActivity activity = new RaffleActivity(2);
// 我们连续抽 300 次奖
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
// 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();
// 第二步抽奖
            activity.raffle();
        }
    }
}
