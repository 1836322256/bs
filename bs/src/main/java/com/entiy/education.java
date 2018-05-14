package com.entiy;

import java.util.Date;

public class education {
    private Integer edId;

    private Integer eId;

    private String edSchool;

    private String edMajor;

    private String edDegree;

    private Date edStime;

    private Date edEtime;

    public Integer getEdId() {
        return edId;
    }

    public void setEdId(Integer edId) {
        this.edId = edId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getEdSchool() {
        return edSchool;
    }

    public void setEdSchool(String edSchool) {
        this.edSchool = edSchool == null ? null : edSchool.trim();
    }

    public String getEdMajor() {
        return edMajor;
    }

    public void setEdMajor(String edMajor) {
        this.edMajor = edMajor == null ? null : edMajor.trim();
    }

    public String getEdDegree() {
        return edDegree;
    }

    public void setEdDegree(String edDegree) {
        this.edDegree = edDegree == null ? null : edDegree.trim();
    }

    public Date getEdStime() {
        return edStime;
    }

    public void setEdStime(Date edStime) {
        this.edStime = edStime;
    }

    public Date getEdEtime() {
        return edEtime;
    }

    public void setEdEtime(Date edEtime) {
        this.edEtime = edEtime;
    }
}