package com.example.securityjst.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/admins")
public class AdminController {
    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "Hello Admin";
    }
}
