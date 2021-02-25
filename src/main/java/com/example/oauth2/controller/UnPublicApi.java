package com.example.oauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secret")
public class UnPublicApi {

    @RequestMapping()
    public Object loginInfo() {
        return "login";
    }

    @RequestMapping("/root")
    public Object rootInfo() {
        return "root";
    }

    @RequestMapping("/user")
    public Object userInfo() {
        return "user";
    }

}
