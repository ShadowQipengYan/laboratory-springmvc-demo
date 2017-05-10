package com.shadow.design.account;

/**
 * </br>
 * Copyright (c) 2014 厦门神州鹰软件科技有限公司
 *
 * @author qipeng.yan
 *
 * @version V5.4
 * @date 2017/5/911:31
 */
public class AccountServiceStrategy {

    IAccountService get(String type){
        if(type.equalsIgnoreCase("tencent")){
            return new TencentAccountServiceImpl();
        }else{
            return new EasemobAccountServiceImpl();
        }
    }
}
