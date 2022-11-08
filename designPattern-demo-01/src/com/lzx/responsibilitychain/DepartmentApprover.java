package com.lzx.responsibilitychain;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 22:40:41
 */
public class DepartmentApprover extends Approver {
    public DepartmentApprover(String name) {
// TODO Auto-generated constructor stub
        super(name);
    }
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
// TODO Auto-generated method stub
        if(purchaseRequest.getPrice() <= 5000) {
            System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
