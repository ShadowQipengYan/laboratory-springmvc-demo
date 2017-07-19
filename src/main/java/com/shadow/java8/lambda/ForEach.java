package com.shadow.java8.lambda;

import com.shadow.bean.TestBean;

import java.util.Arrays;

/**
 * </br>
 * Copyright (c) 2014 厦门神州鹰软件科技有限公司
 *
 * @author qipeng.yan
 * @version V5.4
 * @date 2017/7/138:33
 */
public class ForEach {
    public static void main(String[] args) {
        forEachStringList();
        forEachTestBean();
    }

    public static void forEachStringList() {
        Arrays.asList("a", "b", "c").forEach(e -> System.out.println(e));
    }

    public static void forEachTestBean() {
        TestBean bean1 = new TestBean(1, "name1");
        TestBean bean2 = new TestBean(2, "name2");
        TestBean bean3 = new TestBean(3, "name3");
        Arrays.asList(bean1, bean2, bean3).forEach(bean -> System.out.println(bean.getBeanName()));

    }
}
