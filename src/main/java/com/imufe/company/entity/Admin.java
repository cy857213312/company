package com.imufe.company.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Admin {
    private Integer uid;

    private String name;

    private String password;

    private String token;


}