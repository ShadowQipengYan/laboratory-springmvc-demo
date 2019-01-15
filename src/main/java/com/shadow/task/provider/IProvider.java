package com.shadow.task.provider;

/**
 * @author qipeng.yan
 * @date 2019/1/15 16:17
 */
public interface IProvider<T> {
    /**
     * provider message
     *
     * @param message message
     * @return success or fail
     */
    boolean provider(T message);
}
