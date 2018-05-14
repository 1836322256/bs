package com.entiy;

import java.util.Date;

public class caucus {
    private Integer cId;

    private Integer eId;

    private String cPolitical;

    private Date cStime;

    private String cMark;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getcPolitical() {
        return cPolitical;
    }

    public void setcPolitical(String cPolitical) {
        this.cPolitical = cPolitical == null ? null : cPolitical.trim();
    }

    public Date getcStime() {
        return cStime;
    }

    public void setcStime(Date cStime) {
        this.cStime = cStime;
    }

    public String getcMark() {
        return cMark;
    }

    public void setcMark(String cMark) {
        this.cMark = cMark == null ? null : cMark.trim();
    }
}