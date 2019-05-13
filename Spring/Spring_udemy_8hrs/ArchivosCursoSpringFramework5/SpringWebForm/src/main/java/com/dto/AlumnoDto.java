package com.dto;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.List;

public class AlumnoDto
{
    private Integer ideAlu;
    private String apePat;
    private String apeMat;
    private String desNom;
    private String desEma;
    private Integer ideGen;
    private Integer ideNiv;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fchNac;
    private List<CursoDto> cursoDtoList;
    private UsuarioDto ideUsu;


    public Integer getIdeAlu()
    {
        return ideAlu;
    }

    public void setIdeAlu(Integer ideAlu)
    {
        this.ideAlu = ideAlu;
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

    public Date getFchNac()
    {
        return fchNac;
    }

    public void setFchNac(Date fchNac)
    {
        this.fchNac = fchNac;
    }

    public String getDesEma()
    {
        return desEma;
    }

    public void setDesEma(String desEma)
    {
        this.desEma = desEma;
    }

    public Integer getIdeGen()
    {
        return ideGen;
    }

    public void setIdeGen(Integer ideGen)
    {
        this.ideGen = ideGen;
    }

    public Integer getIdeNiv()
    {
        return ideNiv;
    }

    public void setIdeNiv(Integer ideNiv)
    {
        this.ideNiv = ideNiv;
    }

    public List<CursoDto> getCursoDtoList()
    {
        return cursoDtoList;
    }

    public void setCursoDtoList(List<CursoDto> cursoDtoList)
    {
        this.cursoDtoList = cursoDtoList;
    }

    public UsuarioDto getIdeUsu()
    {
        return ideUsu;
    }

    public void setIdeUsu(UsuarioDto ideUsu)
    {
        this.ideUsu = ideUsu;
    }
}