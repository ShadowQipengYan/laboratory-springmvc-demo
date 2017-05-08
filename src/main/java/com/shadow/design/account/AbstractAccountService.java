package com.shadow.design.account;

/**
 * Created by shadow on 17/5/8.
 */
public abstract class AbstractAccountService<T> implements IAccountService<T>{

    T createBabyAccount(String studentId){
        return createBabyAccount(studentId, "");
    }

    abstract T createBabyAccount(String studentId, String classId);
}
