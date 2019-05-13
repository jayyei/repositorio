package com.controller;

import com.dto.AlumnoDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.File;
import java.io.IOException;

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
    public String SavePOST(ModelMap Model, AlumnoDto Form) throws IOException
    {
        FileCopyUtils.copy(Form.getDesFot().getBytes(), new File("E:/Fotos/" + Form.getDesFot().getOriginalFilename()));
        Model.addAttribute("Foto", Form.getDesFot().getName());
        return "alumno/index";
    }
}