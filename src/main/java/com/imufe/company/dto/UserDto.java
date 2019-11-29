package com.imufe.company.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private Integer id;

    private String account;

    private String password;

    private Integer type;

    private Integer tId;

    private String departmentName;
}
