package com.service.alumno.dto;

public class AlumnoDto
{
    private Integer ideAlu;
    private String nroDni;
    private String apePat;
    private String apeMat;
    private String desNom;
    private String fchNac;

    public Integer getIdeAlu()
    {
        return ideAlu;
    }

    public void setIdeAlu(Integer ideAlu)
    {
        this.ideAlu = ideAlu;
    }

    public String getNroDni()
    {
        return nroDni;
    }

    public void setNroDni(String nroDni)
    {
        this.nroDni = nroDni;
    }

    public String getApePat()
    {
        return apePat;
    }

    public void setApePat(String apePat)
    {
        this.apePat = apePat;
    }

    public String getApeMat()
    {
        return apeMat;
    }

    public void setApeMat(String apeMat)
    {
        this.apeMat = apeMat;
    }

    public String getDesNom()
    {
        return desNom;
    }

    public void setDesNom(String desNom)
    {
        this.desNom = desNom;
    }

    public String getFchNac()
    {
        return fchNac;
    }

    public void setFchNac(String fchNac)
    {
        this.fchNac = fchNac;
    }
}