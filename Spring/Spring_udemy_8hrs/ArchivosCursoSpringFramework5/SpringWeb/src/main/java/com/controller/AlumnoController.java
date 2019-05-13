package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/alumno")
public class AlumnoController
{
    @GetMapping("/buscar/{DesNom}/{ApePat}")
    @ResponseBody
    public String BuscarGET(@PathVariable String DesNom, @PathVariable String ApePat)
    {
        return "Buscar " + DesNom + " Paterno " + ApePat;
    }

    @GetMapping("/lista")
    public String ListaGET(ModelMap Model)
    {
        List<String> NombreList = Arrays.asList("Carlos", "Adan", "Dani", "Jose");
        Model.addAttribute("NombreList", NombreList);
        return "alumnos/list";
    }
}