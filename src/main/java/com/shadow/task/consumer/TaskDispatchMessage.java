package com.shadow.task.consumer;

import lombok.Data;

/**
 * @author qipeng.yan
 * @date 2019/1/16 9:52
 */
@Data
public class TaskDispatchMessage {
    private String createUid;
    private Byte taskType;
}
