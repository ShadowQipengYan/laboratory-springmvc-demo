package com.shadow.task.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author qipeng.yan
 * @date 2019/1/15 15:18
 */
@Data
public class TaskPool {

    private Integer id;
    private String createUid;
    private Byte taskType;
    private Byte taskStatus;
    private String downloadUrl;
    private String features;
    private BigDecimal percent;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private LocalDateTime beginTime;

}
