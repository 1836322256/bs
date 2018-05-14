package com.entiy;

import java.util.Date;

public class check_state {
    private Long cId;

    private Integer eId;

    private String cAttendance;

    private Date cTime;

    private Integer cOverwork;

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getcAttendance() {
        return cAttendance;
    }

    public void setcAttendance(String cAttendance) {
        this.cAttendance = cAttendance == null ? null : cAttendance.trim();
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Integer getcOverwork() {
        return cOverwork;
    }

    public void setcOverwork(Integer cOverwork) {
        this.cOverwork = cOverwork;
    }
}