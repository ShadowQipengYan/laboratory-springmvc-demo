package com.shadow.task.consumer;

/**
 * @author qipeng.yan
 * @date 2019/1/16 9:20
 */
public interface IDispatchCenter {

    boolean dispatch(TaskDispatchMessage message);

}
