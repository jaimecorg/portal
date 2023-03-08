package com.jaimecorg.portal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class LoginController {
    @GetMapping(value = "/login")
    public String login(@RequestParam String nombre, @RequestParam String password){
        return "login";
    }
}
