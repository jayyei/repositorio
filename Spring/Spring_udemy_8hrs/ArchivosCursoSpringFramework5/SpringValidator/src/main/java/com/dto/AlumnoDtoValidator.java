package com.dto;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

@Component
public class AlumnoDtoValidator
{
    public void validate(Object Target, Errors Errors)
    {
        AlumnoDto FormData = (AlumnoDto)Target;
        ValidationUtils.rejectIfEmptyOrWhitespace(Errors, "nroEda", "error.nroEda", "Edad es un campo requerido");
        if(FormData.getApePat() == null || FormData.getApePat().equals(""))
        {
            Errors.rejectValue("apePat", "error.apePat", "Apellido paterno es muy requerido");
        }
        if(FormData.getDesNom() == null || FormData.getDesNom().equals(""))
        {
            Errors.rejectValue("desNom", "error.desNom", "Nombre es muy requerido");
        }
    }
}