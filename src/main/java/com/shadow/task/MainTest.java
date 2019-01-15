package com.shadow.task;

import com.shadow.bean.TestBean;
import com.shadow.task.vo.TaskFeatures;
import com.shadow.util.JSONMapper;

/**
 * @author qipeng.yan
 * @date 2019/1/15 16:32
 */
public class MainTest {

    public static void main(String[] args) {
        TestBean testBean = new TestBean();
        testBean.setBeanId(1);
        testBean.setBeanName("测试bean");

        TaskFeatures taskFeatures = new TaskFeatures();
        taskFeatures.setParamsJson(JSONMapper.json(testBean));
        taskFeatures.setParamsRemark("");
        taskFeatures.setParamClassType(testBean.getClass().getTypeName());

        Class<?> paramClass = null;
        try {
            paramClass = Class.forName(taskFeatures.getParamClassType());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (paramClass == null) {
            throw new RuntimeException("参数类型转化错误");
        }
        Object binding = JSONMapper.binding(taskFeatures.getParamsJson(), paramClass);


    }
}
