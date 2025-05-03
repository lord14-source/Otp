package com.OTP.OTP.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Otp {

    @Id
    private String refNo;
    private String uuid;
    private String mblNo;



    private String otp;

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    // No-args constructor
    public Otp() {
    }

    // All-args constructor
    public Otp(String refNo, String uuid, String mblNo,String otp) {
        this.refNo = refNo;
        this.uuid = uuid;
        this.mblNo = mblNo;
        this.otp=otp;
    }

    // Getters and Setters
    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMblNo() {
        return mblNo;
    }

    public void setMblNo(String mblNo) {
        this.mblNo = mblNo;
    }
}
