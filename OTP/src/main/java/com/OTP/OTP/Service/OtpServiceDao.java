package com.OTP.OTP.Service;

import com.OTP.OTP.Entity.Otp;
import com.OTP.OTP.Repository.OtpRepo;
import com.OTP.OTP.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Optional;
import java.util.UUID;
@Service
public class OtpServiceDao implements OtpService{
    @Autowired
    private OtpRepo otpRepo;
    @Override
    public String create(Otp otp) {
        otp.setRefNo(UUID.randomUUID().toString());
        System.out.println(otp.getUuid());
        otpRepo.save(otp);
        System.out.println("here");
        System.out.println("There");
        System.out.println("thisisthecase");
        return "Success";


    }

    @Override
    public String get(String uuid) {
        Optional<Otp>mbl=otpRepo.findByuuid(uuid);
        if(mbl.isPresent()){
            if(mbl.get().getUuid().equals(uuid)){
                SecureRandom random = new SecureRandom();
                Integer res=( 100000 + random.nextInt(900000));
                // ensures a 6-digit number
return res.toString();

            }
            else{
                throw new IllegalArgumentException("UUID does not match with the registered mobile number.");
            }
        }
        else{
            throw new ResourceNotFoundException("Mobile number is not registered as per UUID server");
        }

    }
}
