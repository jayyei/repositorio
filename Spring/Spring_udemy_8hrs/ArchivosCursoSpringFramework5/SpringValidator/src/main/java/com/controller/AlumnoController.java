package com.controller;

import com.dto.AlumnoDto;
import com.dto.AlumnoDtoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;

@Controller
@RequestMapping("/alumno")
public class AlumnoController
{
    @Autowired
    private AlumnoDtoValidator AlumnoDtoValid;

    @GetMapping("/save")
    public String SaveGET()
    {
        return "alumno/index";
    }

    @PostMapping("/save")
    public String SavePOST(RedirectAttributes Redirect,  ModelMap Model, AlumnoDto Form, BindingResult Result)
    {
        AlumnoDtoValid.validate(Form, Result);
        if(Result.hasErrors())
        {
            Model.addAttribute("Form", Form);
            Model.addAttribute("Result", Result);
            return "alumno/index";
        }
        else
        {
            Redirect.addAttribute("Success", true);
            return "redirect:/alumno/save";
        }
    }
}