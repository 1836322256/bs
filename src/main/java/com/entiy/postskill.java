package com.entiy;

public class postskill {
    private Integer pId;

    private Integer eId;

    private String pSpecialty;

    private String pCet;

    private String pSkill;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getpSpecialty() {
        return pSpecialty;
    }

    public void setpSpecialty(String pSpecialty) {
        this.pSpecialty = pSpecialty == null ? null : pSpecialty.trim();
    }

    public String getpCet() {
        return pCet;
    }

    public void setpCet(String pCet) {
        this.pCet = pCet == null ? null : pCet.trim();
    }

    public String getpSkill() {
        return pSkill;
    }

    public void setpSkill(String pSkill) {
        this.pSkill = pSkill == null ? null : pSkill.trim();
    }
}