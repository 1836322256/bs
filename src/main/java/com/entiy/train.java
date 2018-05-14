package com.entiy;

import java.util.Date;

public class train {
    private Integer tId;

    private Integer eId;

    private String tAgency;

    private Date tStime;

    private Date tEtime;

    private String tCertificate;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String gettAgency() {
        return tAgency;
    }

    public void settAgency(String tAgency) {
        this.tAgency = tAgency == null ? null : tAgency.trim();
    }

    public Date gettStime() {
        return tStime;
    }

    public void settStime(Date tStime) {
        this.tStime = tStime;
    }

    public Date gettEtime() {
        return tEtime;
    }

    public void settEtime(Date tEtime) {
        this.tEtime = tEtime;
    }

    public String gettCertificate() {
        return tCertificate;
    }

    public void settCertificate(String tCertificate) {
        this.tCertificate = tCertificate == null ? null : tCertificate.trim();
    }
}