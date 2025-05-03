package com.OTP.OTP.Repository;

import com.OTP.OTP.Entity.Otp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OtpRepo extends JpaRepository<Otp,String> {
    Optional<Otp>findByuuid(String uuid);

}
