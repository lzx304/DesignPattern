package com.lzx.responsibilitychain;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 22:38:43
 */
public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");
        //需要将各个审批级别的下一个设置好 (处理人构成环形: )
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);
        departmentApprover.processRequest(purchaseRequest);
        PurchaseRequest purchaseRequest2 = new PurchaseRequest(1, 3000, 1);
        viceSchoolMasterApprover.processRequest(purchaseRequest2);
    }
}
