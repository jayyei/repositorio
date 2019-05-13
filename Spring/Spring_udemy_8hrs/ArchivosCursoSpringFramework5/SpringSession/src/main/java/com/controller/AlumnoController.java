package com.controller;

import com.dto.AlumnoDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/alumno")
@SessionAttributes(value = {"AlumnoDto"})
public class AlumnoController
{
    @GetMapping("/save")
    public String SaveGET(ModelMap Model)
    {
        Model.addAttribute("AlumnoDto", new AlumnoDto());
        return "alumno/index";
    }

    @PostMapping("/save")
    public String SavePOST(@ModelAttribute("AlumnoDto")  AlumnoDto AlumnoDTO)
    {
        return "alumno/index";
    }

    @GetMapping("/session")
    @ResponseBody
    public String SessionData(ModelMap Model)
    {
        AlumnoDto AlumnoDTO = (AlumnoDto)Model.get("AlumnoDto");
        return AlumnoDTO.getApePat() + " " + AlumnoDTO.getApeMat();
    }

    @GetMapping("/deletesession")
    @ResponseBody
    private String Delete(SessionStatus Status)
    {
        Status.setComplete();
        return "Datos eliminados";
    }
}