package com.entiy;

import java.util.Date;

public class mission {
    private Integer mId;

    private Integer eId;

    private String mName;

    private String mPerson;

    private Date mEtc;

    private Date mCommit;

    private String mStatus;

    private String mMark;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmPerson() {
        return mPerson;
    }

    public void setmPerson(String mPerson) {
        this.mPerson = mPerson == null ? null : mPerson.trim();
    }

    public Date getmEtc() {
        return mEtc;
    }

    public void setmEtc(Date mEtc) {
        this.mEtc = mEtc;
    }

    public Date getmCommit() {
        return mCommit;
    }

    public void setmCommit(Date mCommit) {
        this.mCommit = mCommit;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus == null ? null : mStatus.trim();
    }

    public String getmMark() {
        return mMark;
    }

    public void setmMark(String mMark) {
        this.mMark = mMark == null ? null : mMark.trim();
    }
}