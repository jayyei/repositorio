package com.service;

public class ProductoDto
{
    private Integer idePro;
    private String nomPro;
    private Double cntPre;
    private Integer cntPro;

    public ProductoDto()
    {
    }

    public ProductoDto(Integer idePro, String nomPro, Double cntPre)
    {
        this.idePro = idePro;
        this.nomPro = nomPro;
        this.cntPre = cntPre;
    }

    public Integer getIdePro()
    {
        return idePro;
    }

    public void setIdePro(Integer idePro)
    {
        this.idePro = idePro;
    }

    public String getNomPro()
    {
        return nomPro;
    }

    public void setNomPro(String nomPro)
    {
        this.nomPro = nomPro;
    }

    public Double getCntPre()
    {
        return cntPre;
    }

    public void setCntPre(Double cntPre)
    {
        this.cntPre = cntPre;
    }

    public Integer getCntPro()
    {
        return cntPro;
    }

    public void setCntPro(Integer cntPro)
    {
        this.cntPro = cntPro;
    }
}