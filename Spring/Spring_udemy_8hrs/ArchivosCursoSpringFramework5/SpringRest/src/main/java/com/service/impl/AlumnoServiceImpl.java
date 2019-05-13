package com.service.impl;

import com.service.IAlumnoService;
import com.dao.IAlumnoDao;
import com.domain.Alumno;
import com.service.alumno.AlumnoDto;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoServiceImpl implements IAlumnoService
{
    @Autowired
    private IAlumnoDao AlumnoDao;

    @Override
    public void Save(AlumnoDto AlumnoDTO)
    {
        Alumno IdeAlu = new Alumno();
        IdeAlu.setNroDni(AlumnoDTO.getNroDni());
        IdeAlu.setApePat(AlumnoDTO.getApePat());
        IdeAlu.setApeMat(AlumnoDTO.getApeMat());
        IdeAlu.setDesNom(AlumnoDTO.getDesNom());
        IdeAlu.setFchNac(LocalDate.parse(AlumnoDTO.getFchNac(), DateTimeFormat.forPattern("dd/MM/yyyy")).toDate());
        AlumnoDao.Save(IdeAlu);
    }

    @Override
    public void Update(AlumnoDto AlumnoDTO)
    {
        Alumno IdeAlu = AlumnoDao.GetById(AlumnoDTO.getIdeAlu());
        IdeAlu.setApePat(AlumnoDTO.getApePat());
        IdeAlu.setApeMat(AlumnoDTO.getApeMat());
        IdeAlu.setDesNom(AlumnoDTO.getDesNom());
        IdeAlu.setFchNac(LocalDate.parse(AlumnoDTO.getFchNac(), DateTimeFormat.forPattern("dd/MM/yyyy")).toDate());
        AlumnoDao.Update(IdeAlu);
    }

    @Override
    public void Delete(Alumno Entity)
    {
        AlumnoDao.Delete(Entity);
    }

    @Override
    public AlumnoDto GetById(Integer Id)
    {
        Alumno IdeAlu = AlumnoDao.GetById(Id);
        if(IdeAlu == null)
        {
            return null;
        }
        else
        {
            AlumnoDto AlumnoDTO = new AlumnoDto();
            AlumnoDTO.setIdeAlu(IdeAlu.getIdeAlu());
            AlumnoDTO.setNroDni(IdeAlu.getNroDni());
            AlumnoDTO.setApePat(IdeAlu.getApePat());
            AlumnoDTO.setApeMat(IdeAlu.getApeMat());
            AlumnoDTO.setDesNom(IdeAlu.getDesNom());
            AlumnoDTO.setFchNac(LocalDate.fromDateFields(IdeAlu.getFchNac()).toString("dd/MM/yyyy"));
            return AlumnoDTO;
        }
    }

    @Override
    public List<AlumnoDto> GetAll()
    {
        List<Alumno> AlumnoList = AlumnoDao.GetAll();
        List<AlumnoDto> AlumnoDtoList = new ArrayList<>();
        for(Alumno AluLop : AlumnoList)
        {
            AlumnoDto AlumnoDTO = new AlumnoDto();
            AlumnoDTO.setIdeAlu(AluLop.getIdeAlu());
            AlumnoDTO.setNroDni(AluLop.getNroDni());
            AlumnoDTO.setApePat(AluLop.getApePat());
            AlumnoDTO.setApeMat(AluLop.getApeMat());
            AlumnoDTO.setDesNom(AluLop.getDesNom());
            AlumnoDTO.setFchNac(LocalDate.fromDateFields(AluLop.getFchNac()).toString("dd/MM/yyyy"));
            AlumnoDtoList.add(AlumnoDTO);
        }
        return AlumnoDtoList;
    }

    @Override
    public List<AlumnoDto> GetAll(Integer Start, Integer Limit)
    {
        List<Alumno> AlumnoList = AlumnoDao.GetAll(Start, Limit);
        List<AlumnoDto> AlumnoDtoList = new ArrayList<>();
        for(Alumno AluLop : AlumnoList)
        {
            AlumnoDto AlumnoDTO = new AlumnoDto();
            AlumnoDTO.setIdeAlu(AluLop.getIdeAlu());
            AlumnoDTO.setNroDni(AluLop.getNroDni());
            AlumnoDTO.setApePat(AluLop.getApePat());
            AlumnoDTO.setApeMat(AluLop.getApeMat());
            AlumnoDTO.setDesNom(AluLop.getDesNom());
            AlumnoDTO.setFchNac(LocalDate.fromDateFields(AluLop.getFchNac()).toString("dd/MM/yyyy"));
            AlumnoDtoList.add(AlumnoDTO);
        }
        return AlumnoDtoList;
    }
}