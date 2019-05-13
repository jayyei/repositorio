package com.controller;

import com.dao.IAlumnoDao;
import com.domain.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController
{
    @Autowired
    private IAlumnoDao AlumnoDao;

    @GetMapping("/")
    public String IndexGET()
    {
        return "index";
    }

    @PostMapping("/save")
    @Transactional
    public String SavePOST(Alumno Form)
    {
        AlumnoDao.Save(Form);
        return "index";
    }
}