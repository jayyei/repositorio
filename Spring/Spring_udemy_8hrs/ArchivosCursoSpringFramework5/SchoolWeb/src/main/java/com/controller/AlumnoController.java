package com.controller;

import com.domain.Alumno;
import com.service.IAlumnoService;
import com.service.alumno.dto.AlumnoDto;
import com.service.alumno.validator.AlumnoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;

@Controller
@RequestMapping("/alumno")
public class AlumnoController
{
    @Autowired
    private IAlumnoService AlumnoService;

    @Autowired
    private AlumnoValidator AlumnoValid;

    @ModelAttribute("AlumnoDtoList")
    public List<AlumnoDto> AlumnoDtoList()
    {
        return AlumnoService.GetAll();
    }

    @GetMapping("/save")
    public String IndexGET()
    {
        return "alumno/index";
    }

    @PostMapping("/save")
    public String SavePOST(RedirectAttributes Redirect, ModelMap Model, AlumnoDto AlumnoDTO, BindingResult Result)
    {
        AlumnoValid.validate(AlumnoDTO, Result);
        if(Result.hasErrors())
        {
            Model.addAttribute("AlumnoDTO", AlumnoDTO);
            Model.addAttribute("Result", Result);
            return "alumno/index";
        }
        else
        {
            AlumnoService.SaveOrUpdate(AlumnoDTO);
            Redirect.addFlashAttribute("Success", true);
            return "redirect:/alumno/save";
        }
    }

    @PostMapping("/load")
    public String EditGET(ModelMap Model, @RequestParam Integer Id)
    {
        AlumnoDto AlumnoDTO = AlumnoService.GetById(Id);
        Model.addAttribute("AlumnoDTO", AlumnoDTO);
        return "alumno/index";
    }

    @PostMapping("/delete")
    public String DeletePOST(@RequestParam Integer Id)
    {
        AlumnoService.Delete(new Alumno(Id));
        return "redirect:/alumno/save";
    }

    @PostMapping("/search")
    public String DeletePOST(ModelMap Model, @RequestParam String DesBus)
    {
        List<AlumnoDto> AlumnoDtoList = AlumnoService.SearchList(DesBus);
        Model.addAttribute("AlumnoDtoList", AlumnoDtoList);
        return "alumno/index";
    }
}