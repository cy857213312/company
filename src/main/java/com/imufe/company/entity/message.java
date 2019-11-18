package com.imufe.company.entity;
/**
 * 企业信息
 */
public class message extends Company {
    //安监部门名字
    private String sname;
    //所属区域名字
    private String aname;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
}

