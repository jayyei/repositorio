package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController
{
    @GetMapping("/")
    public String IndexGET()
    {
        return "index";
    }

    @GetMapping("/datos")
    @ResponseBody
    public String Data()
    {
        return "index";
    }
}