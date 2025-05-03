package com.OTP.OTP.Service;

import com.OTP.OTP.Entity.Otp;

public interface OtpService {
    public String create(Otp otp);
    public String get(String uuid);
}
