package com.appointmentapp.appointmentapp.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Authentication")
@RestController
public class Authentication {
    Authentication authentication;
    @PostMapping
    public String Login( Authentication authentication)
    {
        this.authentication=authentication;
        return "Login Success";
    }
}
