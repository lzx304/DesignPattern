package com.lzx.responsibilitychain;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 22:39:58
 */
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
// TODO Auto-generated constructor stub
        super(name);
    }
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
// TODO Auto-generated method stub
        if(purchaseRequest.getPrice() < 5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
