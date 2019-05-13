package com.controller;

import com.dto.AlumnoDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController
{
    @GetMapping("/save")
    public String SaveGET()
    {
        return "alumno/index";
    }

    @PostMapping("/save")
    public String SavePOST(ModelMap Model, AlumnoDto AlumnoDTO)
    {
        String DesGen = AlumnoDTO.getIdeGen() == 1 ? "Masculino" : "Femenino";
        String FullName = AlumnoDTO.getApePat() + " " + AlumnoDTO.getApeMat() + " " + AlumnoDTO.getDesNom() + " " +AlumnoDTO.getDesEma() + " " + DesGen;
        Model.addAttribute("FullName", FullName);
        return "alumno/index";
    }
}