package com.service;

import com.domain.Alumno;
import com.service.alumno.dto.AlumnoDto;
import java.util.List;

public interface IAlumnoService
{
    void SaveOrUpdate(AlumnoDto Entity);
    void Update(Alumno Entity);
    void Delete(Alumno Entity);
    AlumnoDto GetById(Integer Id);
    List<AlumnoDto> GetAll();
    List<AlumnoDto> SearchList(String DesBus);
}