package com.shadow.java8.lambda;

import com.shadow.bean.TestBean;
import com.shadow.bean.TestBeanBuilder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * </br>
 * Copyright (c) 2014 厦门神州鹰软件科技有限公司
 *
 * @author qipeng.yan
 * @version V5.4
 * @date 2017/8/38:59
 */
public class ListMap {
    public static void main(String[] args) {
//        forEachRemove();
        iteratorRemove();
    }

    /**
     * error:会跳过元素
     */
    public static void forIndexRemove() {
        List<TestBean> list = TestBeanBuilder.list();
        for (int i = 0; i < list.size(); i++) {
            if (i == 1) {
                list.remove(i);
                continue;
            }
            System.out.println(list.get(i).getBeanName());
        }
    }

    public static void forEachRemove() {
        List<TestBean> list2 = TestBeanBuilder.list();
        for (TestBean bean : list2) {
            if (bean.getBeanId() == 2) {
                list2.remove(bean);
                continue;
            }
            System.out.println(bean.getBeanName());
        }
    }

    public static void iteratorRemove() {
        List<TestBean> list = TestBeanBuilder.list();
        Iterator<TestBean> iterator = list.iterator();
        while (iterator.hasNext()) {
            TestBean bean = iterator.next();
            if (bean.getBeanId() == 2) {
                iterator.remove();
                continue;
            }
            System.out.println(bean.getBeanName());
        }
    }

    public static void distinct() {
        List<TestBean> list = TestBeanBuilder.list();
        //去除重复
        Map<Integer, TestBean> collect = list.stream().collect(Collectors.toMap(TestBean::getBeanId, Function.identity(), (key1, key2) -> key2, HashMap::new));
        collect.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v.getBeanName());
        });
    }

}
