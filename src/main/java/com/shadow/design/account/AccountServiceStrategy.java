package com.shadow.design.account;

import org.springframework.stereotype.Service;

/**
 * </br>
 * Copyright (c) 2014 厦门神州鹰软件科技有限公司
 *
 * @author qipeng.yan
 *
 * @version V5.4
 * @date 2017/5/911:31
 */
@Service
public class AccountServiceStrategy {

    IAccountService get(String type){
        return new TencentAccountServiceImpl();
    }
}
