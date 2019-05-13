package com.service.impl;

import com.dao.IAlumnoDao;
import com.domain.Alumno;
import com.service.IAlumnoService;
import com.service.alumno.dto.AlumnoDto;
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
    public void SaveOrUpdate(AlumnoDto Form)
    {
        if(Form.getIdeAlu() == null)
        {
            Alumno Student = new Alumno();
            Student.setNroDni(Form.getNroDni());
            Student.setApePat(Form.getApePat());
            Student.setApeMat(Form.getApeMat());
            Student.setDesNom(Form.getDesNom());
            Student.setFchNac(LocalDate.parse(Form.getFchNac(), DateTimeFormat.forPattern("dd/MM/yyyy")).toDate());
            AlumnoDao.Save(Student);
        }
        else
        {
            Alumno Student = AlumnoDao.GetById(Form.getIdeAlu());
            Student.setApePat(Form.getApePat());
            Student.setApeMat(Form.getApeMat());
            Student.setDesNom(Form.getDesNom());
            Student.setFchNac(LocalDate.parse(Form.getFchNac(), DateTimeFormat.forPattern("dd/MM/yyyy")).toDate());
            AlumnoDao.Update(Student);
        }
    }

    @Override
    public void Update(Alumno Entity)
    {
        AlumnoDao.Update(Entity);
    }

    @Override
    public void Delete(Alumno Entity)
    {
        AlumnoDao.Delete(Entity);
    }

    @Override
    public AlumnoDto GetById(Integer Id)
    {
        Alumno Student = AlumnoDao.GetById(Id);
        AlumnoDto AlumnoDTO = new AlumnoDto();
        AlumnoDTO.setIdeAlu(Student.getIdeAlu());
        AlumnoDTO.setNroDni(Student.getNroDni());
        AlumnoDTO.setApePat(Student.getApePat());
        AlumnoDTO.setApeMat(Student.getApeMat());
        AlumnoDTO.setDesNom(Student.getDesNom());
        AlumnoDTO.setFchNac(LocalDate.fromDateFields(Student.getFchNac()).toString("dd/MM/yyyy"));
        return AlumnoDTO;
    }

    @Override
    public List<AlumnoDto> GetAll()
    {
        List<AlumnoDto> DataList = new ArrayList<>();
        List<Alumno> AlumnoList = AlumnoDao.GetAll();
        for(Alumno AluLop : AlumnoList)
        {
            AlumnoDto AlumnoDTO = new AlumnoDto();
            AlumnoDTO.setIdeAlu(AluLop.getIdeAlu());
            AlumnoDTO.setNroDni(AluLop.getNroDni());
            AlumnoDTO.setApePat(AluLop.getApePat());
            AlumnoDTO.setApeMat(AluLop.getApeMat());
            AlumnoDTO.setDesNom(AluLop.getDesNom());
            AlumnoDTO.setFchNac(LocalDate.fromDateFields(AluLop.getFchNac()).toString("dd/MM/yyyy"));
            DataList.add(AlumnoDTO);
        }
        return DataList;
    }

    @Override
    public List<AlumnoDto> SearchList(String DesBus)
    {
        List<AlumnoDto> DataList = new ArrayList<>();
        List<Alumno> AlumnoList = AlumnoDao.GetForSearchList(DesBus);
        for(Alumno AluLop : AlumnoList)
        {
            AlumnoDto AlumnoDTO = new AlumnoDto();
            AlumnoDTO.setIdeAlu(AluLop.getIdeAlu());
            AlumnoDTO.setNroDni(AluLop.getNroDni());
            AlumnoDTO.setApePat(AluLop.getApePat());
            AlumnoDTO.setApeMat(AluLop.getApeMat());
            AlumnoDTO.setDesNom(AluLop.getDesNom());
            AlumnoDTO.setFchNac(LocalDate.fromDateFields(AluLop.getFchNac()).toString("dd/MM/yyyy"));
            DataList.add(AlumnoDTO);
        }
        return DataList;
    }
}