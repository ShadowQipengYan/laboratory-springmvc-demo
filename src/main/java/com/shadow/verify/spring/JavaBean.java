package com.shadow.verify.spring;

import com.shadow.bean.TestBean;
import org.springframework.beans.BeanUtils;
import org.springframework.util.NumberUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Objects;

/**
 * </br>
 * Copyright (c) 2014 厦门神州鹰软件科技有限公司
 *
 * @author qipeng.yan
 * @version V5.4
 * @date 2017/7/1917:17
 */
public class JavaBean {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        PropertyDescriptor[] propertyDescriptors = getPropertyDescriptors(TestBean.class);

        TestBean testBean = null;
        try {
            testBean = TestBean.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        TestBean finalTestBean = testBean;
        Arrays.asList(propertyDescriptors).forEach(propertyDescriptor -> {
//            System.out.println(propertyDescriptor.getName());
            setter(propertyDescriptor, finalTestBean);
        });

        System.out.println(testBean.getBeanId());
        System.out.println(testBean.getBeanName());
    }

    public static PropertyDescriptor[] getPropertyDescriptors(Class clazz) throws IllegalAccessException, InstantiationException {
        PropertyDescriptor[] propertyDescriptors = BeanUtils.getPropertyDescriptors(clazz);
        return propertyDescriptors;
    }

    public static void setter(PropertyDescriptor propertyDescriptor, Object o) {
        if (Objects.isNull(o)) {
            return;
        }
        Method writeMethod = propertyDescriptor.getWriteMethod();
        if (writeMethod == null) return;
        if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
            writeMethod.setAccessible(true);
        }
        try {
            Class propertyType = propertyDescriptor.getPropertyType();
            if (propertyType.isAssignableFrom(String.class)) {
                writeMethod.invoke(o, propertyDescriptor.getName());
            } else if (Number.class.isAssignableFrom(propertyType)) {
                writeMethod.invoke(o, NumberUtils.parseNumber(LocalTime.now().format(DateTimeFormatter.ofPattern("mmssSS")), propertyType));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
