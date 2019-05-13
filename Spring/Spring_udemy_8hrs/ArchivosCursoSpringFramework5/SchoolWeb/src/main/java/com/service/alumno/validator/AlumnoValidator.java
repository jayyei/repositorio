package com.service.alumno.validator;

import com.service.alumno.dto.AlumnoDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

@Component
public class AlumnoValidator
{
    public void validate(Object Target, Errors Errors)
    {
        AlumnoDto FormData = (AlumnoDto)Target;
        ValidationUtils.rejectIfEmptyOrWhitespace(Errors, "apePat", "error.apePat", "Apellido paterno es requerido");
        ValidationUtils.rejectIfEmptyOrWhitespace(Errors, "nroDni", "error.nroDni", "DNI Es requerido");
        ValidationUtils.rejectIfEmptyOrWhitespace(Errors, "fchNac", "error.fchNac", "Fecha de nacimiento es requerido");
        if(FormData.getApePat() == null || FormData.getApePat().equals(""))
        {
            Errors.rejectValue("apeMat", "error.apeMat", "Apellido materno es muy requerido");
        }
        if(FormData.getDesNom() == null || FormData.getDesNom().equals(""))
        {
            Errors.rejectValue("desNom", "error.desNom", "Nombre es muy requerido");
        }
        if(!FormData.getFchNac().equals("") && !IsDateFormat(FormData.getFchNac()))
        {
            Errors.rejectValue("fchNac", "error.fchNac", "Formato de fecha incorrecto");
        }
    }

    private static boolean IsDateFormat(String Fecha)
    {
        try
        {
            SimpleDateFormat FormatDate = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            FormatDate.setLenient(false);
            FormatDate.parse(Fecha);
        }
        catch(ParseException ParseExcep)
        {
            return false;
        }
        return true;
    }
}