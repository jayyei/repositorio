package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumno", schema = "public")
public class Alumno
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ide_alu")
    private Integer ideAlu;

    @Column(name = "nro_dni")
    private String nroDni;

    @Column(name = "ape_pat")
    private String apePat;

    @Column(name = "ape_mat")
    private String apeMat;

    @Column(name = "des_nom")
    private String desNom;

    public Alumno()
    {
    }

    public Alumno(Integer ideAlu)
    {
        this.ideAlu = ideAlu;
    }

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
}