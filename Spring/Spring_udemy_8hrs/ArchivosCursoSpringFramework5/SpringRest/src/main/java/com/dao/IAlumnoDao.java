package com.dao;

import com.domain.Alumno;
import java.util.List;

public interface IAlumnoDao
{
    void Save(Alumno Entity);
    void Update(Alumno Entity);
    void Delete(Alumno Entity);
    Alumno GetById(Integer Id);
    List<Alumno> GetAll();
    List<Alumno> GetAll(Integer Start, Integer Limit);
}