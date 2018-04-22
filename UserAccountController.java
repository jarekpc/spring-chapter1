package com.example.springchapter1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account/*")
public class UserAccountController {

    @RequestMapping
    public String login(){
        return "login";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }

    public String forgotpassword(){
        return "forgotpassword";
    }
}
