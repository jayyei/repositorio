package com.service;

import com.domain.Alumno;
import com.service.alumno.AlumnoDto;
import java.util.List;

public interface IAlumnoService
{
    void Save(AlumnoDto AlumnoDTO);
    void Update(AlumnoDto AlumnoDTO);
    void Delete(Alumno Entity);
    AlumnoDto GetById(Integer Id);
    List<AlumnoDto> GetAll();
    List<AlumnoDto> GetAll(Integer Start, Integer Limit);
}