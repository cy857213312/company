package com.imufe.company.dto;

import com.imufe.company.entity.Area;
import com.imufe.company.entity.SecurityDepartment;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
public class CompanyDto {

    private Integer id;

    private String name;

    private String address;

    private String uscc;

    private String nature;

    private String legal;

    private String phone;

    private String fax;

    private String mail;

    private String productionPermit;

    private String number;

    private String produce;

    private String type;

    private Float longitude;

    private Float latitude;

    private Integer securityDepartmentId;

    private SecurityDepartment securityDepartment;

    private Integer areaId;

    private Area area;


}
