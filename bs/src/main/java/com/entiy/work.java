package com.entiy;

import java.util.Date;

public class work {
    private Integer wId;

    private Integer eId;

    private String wUnit;

    private String wType;

    private Date wStime;

    private Date wEtime;

    private String wPosition;

    private String wName;

    private String wMark;

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getwUnit() {
        return wUnit;
    }

    public void setwUnit(String wUnit) {
        this.wUnit = wUnit == null ? null : wUnit.trim();
    }

    public String getwType() {
        return wType;
    }

    public void setwType(String wType) {
        this.wType = wType == null ? null : wType.trim();
    }

    public Date getwStime() {
        return wStime;
    }

    public void setwStime(Date wStime) {
        this.wStime = wStime;
    }

    public Date getwEtime() {
        return wEtime;
    }

    public void setwEtime(Date wEtime) {
        this.wEtime = wEtime;
    }

    public String getwPosition() {
        return wPosition;
    }

    public void setwPosition(String wPosition) {
        this.wPosition = wPosition == null ? null : wPosition.trim();
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName == null ? null : wName.trim();
    }

    public String getwMark() {
        return wMark;
    }

    public void setwMark(String wMark) {
        this.wMark = wMark == null ? null : wMark.trim();
    }
}