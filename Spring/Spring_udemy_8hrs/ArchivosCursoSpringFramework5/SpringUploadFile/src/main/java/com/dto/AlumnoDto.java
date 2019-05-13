package com.dto;

import org.springframework.web.multipart.MultipartFile;

public class AlumnoDto
{
    private String nomAlu;
    private MultipartFile desFot;

    public String getNomAlu()
    {
        return nomAlu;
    }

    public void setNomAlu(String nomAlu)
    {
        this.nomAlu = nomAlu;
    }

    public MultipartFile getDesFot()
    {
        return desFot;
    }

    public void setDesFot(MultipartFile desFot)
    {
        this.desFot = desFot;
    }
}