package com.entiy;

import java.util.Date;

public class employeeinfo {
    private Integer eId;

    private String ePassword;

    private String permission;

    private Date eHiredate;

    private String eImage;

    private String eGender;

    private String eNation;

    private String eNative;

    private Integer ePhone;

    private String eEmail;

    private Date eBirth;

    private String eAge;

    private String eDepartment;

    private Integer eCard;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getePassword() {
        return ePassword;
    }

    public void setePassword(String ePassword) {
        this.ePassword = ePassword == null ? null : ePassword.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public Date geteHiredate() {
        return eHiredate;
    }

    public void seteHiredate(Date eHiredate) {
        this.eHiredate = eHiredate;
    }

    public String geteImage() {
        return eImage;
    }

    public void seteImage(String eImage) {
        this.eImage = eImage == null ? null : eImage.trim();
    }

    public String geteGender() {
        return eGender;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender == null ? null : eGender.trim();
    }

    public String geteNation() {
        return eNation;
    }

    public void seteNation(String eNation) {
        this.eNation = eNation == null ? null : eNation.trim();
    }

    public String geteNative() {
        return eNative;
    }

    public void seteNative(String eNative) {
        this.eNative = eNative == null ? null : eNative.trim();
    }

    public Integer getePhone() {
        return ePhone;
    }

    public void setePhone(Integer ePhone) {
        this.ePhone = ePhone;
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail == null ? null : eEmail.trim();
    }

    public Date geteBirth() {
        return eBirth;
    }

    public void seteBirth(Date eBirth) {
        this.eBirth = eBirth;
    }

    public String geteAge() {
        return eAge;
    }

    public void seteAge(String eAge) {
        this.eAge = eAge == null ? null : eAge.trim();
    }

    public String geteDepartment() {
        return eDepartment;
    }

    public void seteDepartment(String eDepartment) {
        this.eDepartment = eDepartment == null ? null : eDepartment.trim();
    }

    public Integer geteCard() {
        return eCard;
    }

    public void seteCard(Integer eCard) {
        this.eCard = eCard;
    }
    public String toString(){
        return "id:"+geteId()+"password:"+getePassword()+"...."+getPermission();
    }
}