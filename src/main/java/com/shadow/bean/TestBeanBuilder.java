package com.shadow.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * </br>
 * Copyright (c) 2014 厦门神州鹰软件科技有限公司
 *
 * @author qipeng.yan
 * @version V5.4
 * @date 2017/8/39:00
 */
public class TestBeanBuilder {

    public static List<TestBean> list() {
        List<TestBean> result = new ArrayList<>();
        TestBean bean1 = new TestBean(1, "name1");
        TestBean bean2 = new TestBean(2, "name2");
        TestBean bean3 = new TestBean(3, "name3");
        TestBean bean4 = new TestBean(4, "name4");
        result.add(bean1);
        result.add(bean2);
        result.add(bean3);
        result.add(bean4);
        return result;
    }

    public static List<TestBean> listEmpty() {
        List<TestBean> result = new ArrayList<>();
        return result;
    }
}
