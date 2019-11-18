package com.imufe.company.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Company {
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

    private Integer securityDepartmentId;

    private Integer areaId;

    private Integer mainPerson;

    private Integer middlePerson;

    private Integer safetyPerson;

    private Integer technologyPerson;

    private Integer workPerson;

    private Integer handlePerson;

    private String keyTechnolo;

    private String majorHazard;

    private Float longitude;

    private Float latitude;



}