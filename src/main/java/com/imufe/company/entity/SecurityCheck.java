package com.imufe.company.entity;

/**
 * 监管检查信息表
 * 封装的新的实体，该页面需要安监局名称
 */
public class SecurityCheck extends Check {
    private String sname;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}

