package com.herman.entity;

import java.util.Date;

public class Hero {
    private Integer id;

    private String name;

    private String power;

    private String alterego;

    private Date createTime;

    private Date updateTime;

    private Date beginTime;

    private Date endTime;

    public Hero() {
    }

    public Hero(Integer id, String name, String power, String alterego, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.alterego = alterego;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    public String getAlterego() {
        return alterego;
    }

    public void setAlterego(String alterego) {
        this.alterego = alterego == null ? null : alterego.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}