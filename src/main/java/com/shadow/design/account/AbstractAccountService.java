package com.shadow.design.account;

/**
 * Created by shadow on 17/5/8.
 */
public abstract class AbstractAccountService<T> implements IAccountService<T>{

    public T createBabyAccount(String studentId){
        //TODO
        return createBabyAccount(studentId, "");
    }

    abstract T createBabyAccount(String studentId, String classId);
}
