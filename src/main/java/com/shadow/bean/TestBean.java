package com.shadow.bean;

/**
 * </br>
 * Copyright (c) 2014 厦门神州鹰软件科技有限公司
 *
 * @author qipeng.yan
 * @version V5.4
 * @date 2017/7/138:41
 */
public class TestBean {

    private Integer beanId;
    private String beanName;

    public TestBean() {
    }

    public TestBean(Integer beanId, String beanName) {
        this.beanId = beanId;
        this.beanName = beanName;
    }

    public Integer getBeanId() {
        return beanId;
    }

    public void setBeanId(Integer beanId) {
        this.beanId = beanId;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
