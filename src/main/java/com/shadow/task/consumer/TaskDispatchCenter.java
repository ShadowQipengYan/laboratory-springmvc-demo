package com.shadow.task.consumer;

/**
 * 任务调度中心
 *
 * @author qipeng.yan
 * @date 2019/1/16 9:20
 */
public class TaskDispatchCenter implements IDispatchCenter {

    @Override
    public boolean dispatch(TaskDispatchMessage message) {
        return false;
    }
}
