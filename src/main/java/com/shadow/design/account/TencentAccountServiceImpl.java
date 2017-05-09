package com.shadow.design.account;

/**
 * Created by shadow on 17/5/8.
 */
public class TencentAccountServiceImpl extends AbstractAccountService<TencentAccount>{

    @Override
    public TencentAccount getBabyAccount() {
        return null;
    }

    @Override
    TencentAccount createBabyAccount(String studentId, String classId) {
        return new TencentAccount(studentId);
    }
}
