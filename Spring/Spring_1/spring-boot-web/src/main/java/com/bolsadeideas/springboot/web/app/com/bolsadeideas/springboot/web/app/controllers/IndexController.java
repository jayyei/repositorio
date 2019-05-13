package com.bolsadeideas.springboot.web.app.com.bolsadeideas.springboot.web.app.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    //@RequestMapping(value="/index", method= RequestMethod.GET) Esta linea se remplaza por la siguiente
    @GetMapping(value="/index")
    //@GetMapping({"/index", "/", "/home"}) esta funcion esta asociada a multiples rutas
    public String index(ModelMap model){
        model.addAttribute("titulo", "Hola spring framework");
        return "index";
    }
}
