package com.shadow.java8.string;

import java.util.ArrayList;
import java.util.List;

/**
 * </br>
 * Copyright (c) 2014 厦门神州鹰软件科技有限公司
 *
 * @author qipeng.yan
 * @version V5.4
 * @date 2017/8/314:25
 */
public class StringTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        System.out.println(String.format("往学校标签发送消息失败，tags=%s", list));
    }
}
