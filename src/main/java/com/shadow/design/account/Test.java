package com.shadow.design.account;

/**
 * Created by shadow on 17/5/8.
 */
public class Test {

    public static void main(String[] args) {
        TencentAccountServiceImpl tencentAccountService = new TencentAccountServiceImpl();

        TencentAccount tencentAccount = tencentAccountService.createBabyAccount("account1");
        System.out.println(tencentAccount.getAccount());

        tencentAccount = tencentAccountService.createBabyAccount("account2","");
        System.out.println(tencentAccount.getAccount());
    }
}
