package com.entiy;

import java.util.Date;

public class award {
    private Integer awId;

    private Integer eId;

    private String awName;

    private String awType;

    private Date awTime;

    private String awMark;

    public Integer getAwId() {
        return awId;
    }

    public void setAwId(Integer awId) {
        this.awId = awId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getAwName() {
        return awName;
    }

    public void setAwName(String awName) {
        this.awName = awName == null ? null : awName.trim();
    }

    public String getAwType() {
        return awType;
    }

    public void setAwType(String awType) {
        this.awType = awType == null ? null : awType.trim();
    }

    public Date getAwTime() {
        return awTime;
    }

    public void setAwTime(Date awTime) {
        this.awTime = awTime;
    }

    public String getAwMark() {
        return awMark;
    }

    public void setAwMark(String awMark) {
        this.awMark = awMark == null ? null : awMark.trim();
    }
}