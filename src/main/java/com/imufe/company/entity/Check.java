package com.imufe.company.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Check {
    private Integer id;

    private Integer sdId;

    private Integer type;

    private String name;

    private String method;

    private String kind;

    private Integer gsId;

    private Integer gsrId;

    private String condition;

    private Integer score;

    private Date createTime;


}