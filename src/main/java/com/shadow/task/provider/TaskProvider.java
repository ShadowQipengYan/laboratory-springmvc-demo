package com.shadow.task.provider;

import com.shadow.task.entity.TaskPool;
import com.shadow.task.vo.TaskFeatures;
import com.shadow.util.JSONMapper;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 任务提供者
 *
 * @author qipeng.yan
 * @date 2019/1/15 15:42
 */
public class TaskProvider implements IProvider<TaskProviderMessage<TaskPool>> {

    @Override
    public boolean provider(TaskProviderMessage message) {
        //save db
        Object params = message.getParams();
        TaskFeatures taskFeatures = new TaskFeatures();
        taskFeatures.setParamsJson(JSONMapper.json(params));
        taskFeatures.setParamsRemark("");
        taskFeatures.setParamsClassType(params.getClass().getTypeName());

        TaskPool taskPool = new TaskPool();
        taskPool.setCreateUid(message.getCreateUid());
        taskPool.setTaskType(message.getTaskType());
        taskPool.setTaskStatus((byte) 0);
        taskPool.setFeatures(JSONMapper.json(taskFeatures));
        taskPool.setPercent(new BigDecimal("0"));
        taskPool.setCreateTime(LocalDateTime.now());
        taskPool.setUpdateTime(LocalDateTime.now());


        //send mq
        return false;
    }
}
