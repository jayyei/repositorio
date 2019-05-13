package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class IndexController
{
    @ModelAttribute("Nombre")
    public String NombreData()
    {
        return "Carlos";
    }

    @ModelAttribute("Apellido")
    public String ApellidoData()
    {
        return "Mollapaza";
    }

    @GetMapping("/")
    public String IndexGET(ModelMap Model)
    {
        return "index/index";
    }
}