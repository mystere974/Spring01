package com.mypackage.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String i() {
        return "William Harnet";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String in() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String ind() {
        return "Jodie Whittaker";
    }

}
