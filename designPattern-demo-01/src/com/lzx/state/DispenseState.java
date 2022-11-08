package com.lzx.state;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 17:38:13
 */
/**
 * 发放奖品的状态
 * @author Administrator
 *
 */
public class DispenseState extends State {
    // 初始化时传入活动引用，发放奖品后改变其状态
    RaffleActivity activity;
    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }
    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }
    //发放奖品
    @Override
    public void dispensePrize() {
        int count = activity.getCount();
        if ( count > 0) {
            System.out.println("恭喜中奖了");
            // 改变状态为不能抽奖
            activity.setState(activity.getNoRafflleState());
            if (count == 1){
                activity.setState(activity.getDispensOutState());
            }
        } else {
            System.out.println("很遗憾，奖品发送完了");
// 改变状态为奖品发送完毕, 后面我们就不可以抽奖
            activity.setState(activity.getDispensOutState());
//System.out.println("抽奖活动结束");
//System.exit(0);
        }
    }
}
