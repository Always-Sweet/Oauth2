package com.example.oauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class PublicApi {

    @RequestMapping()
    public String hello() {
        return "welcome";
    }

}
