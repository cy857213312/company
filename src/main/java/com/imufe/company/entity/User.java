package com.imufe.company.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private Integer id;

    private String account;

    private String password;

    private Integer type;

    private Integer tId;


}