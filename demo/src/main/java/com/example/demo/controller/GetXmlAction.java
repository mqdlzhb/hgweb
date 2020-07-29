package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Action")
public class GetXmlAction {
    @RequestMapping("/index")
    @ResponseBody
    public String List(@RequestBody String data, HttpServletRequest request){
        System.out.println(data);
        return "test";
    }
}
