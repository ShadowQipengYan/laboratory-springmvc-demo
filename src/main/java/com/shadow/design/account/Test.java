package com.shadow.design.account;

/**
 * Created by shadow on 17/5/8.
 */
public class Test {

    static AccountServiceStrategy strategy = new AccountServiceStrategy();

    public static void main(String[] args) {
        IAccountService<TencentAccount> accountService = strategy.get("type");
        TencentAccount student = accountService.createBabyAccount("student1");
        System.out.println(student.getAccount());
        student = accountService.createBabyAccount("student2");
        System.out.println(student.getAccount());
    }
}
