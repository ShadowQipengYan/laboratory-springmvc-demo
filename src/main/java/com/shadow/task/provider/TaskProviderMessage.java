package com.shadow.task.provider;

import lombok.Data;

/**
 * @author qipeng.yan
 * @date 2019/1/15 16:21
 */
@Data
public class TaskProviderMessage<T> {
    private String createUid;
    private Byte taskType;
    private T params;
    private String paramsRemark;
}
