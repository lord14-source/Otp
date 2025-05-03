package com.OTP.OTP.ControllerOtp;

import com.OTP.OTP.Entity.Otp;
import com.OTP.OTP.Service.OtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/OTP")
public class Controller {
    @Autowired
    private OtpService otpService;
    @PostMapping
    public ResponseEntity<String>create(@RequestBody Otp otp){
        return ResponseEntity.status(HttpStatus.CREATED).body(otpService.create(otp));

    }

    @GetMapping("/{uuid}")
    public ResponseEntity<String>get(@PathVariable String uuid){
        System.out.println("mscall");
        return  ResponseEntity.status(HttpStatus.OK).body(otpService.get(uuid));
    }
}
