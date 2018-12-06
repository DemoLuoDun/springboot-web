package com.best.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author luodun
 *         Date 2018/11/7
 */
@Getter
@Setter
@ToString
public class Area {

    private int areaId;
    private String areaName;
    private int priority;
    private Date createTime;
    private Date updateTime;
}
