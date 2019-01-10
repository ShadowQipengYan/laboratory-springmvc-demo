package com.shadow.design.account;

/**
 * </br>
 * Copyright (c) 2014 厦门神州鹰软件科技有限公司
 *
 * @author qipeng.yan
 * @version V5.4
 * @date 2017/5/108:42
 */
public class EasemobAccountServiceImpl extends AbstractAccountService<EasemobAccount> {
    @Override
    public EasemobAccount getBabyAccount() {
        return null;
    }

    @Override
    public EasemobAccount createBabyAccount(String studentId) {
        return createBabyAccount(studentId + "custom", "");
    }

    @Override
    EasemobAccount createBabyAccount(String studentId, String classId) {
        return new EasemobAccount(studentId);
    }
}
