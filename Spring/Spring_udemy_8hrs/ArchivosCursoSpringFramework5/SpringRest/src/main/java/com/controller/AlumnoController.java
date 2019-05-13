package com.controller;

import com.domain.Alumno;
import com.service.IAlumnoService;
import com.service.alumno.AlumnoDto;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController
{
    @Autowired
    private IAlumnoService AlumnoService;

    /*@GetMapping
    public ResponseEntity<List<AlumnoDto>> DataList()
    {
        List<AlumnoDto> AlumnosList = AlumnoService.GetAll();
        return new ResponseEntity<>(AlumnosList, AlumnosList.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }*/

    @GetMapping
    public JSONObject ListJson(@RequestParam int page, @RequestParam int start, @RequestParam int limit)
    {
        List<AlumnoDto> AlumnosList = AlumnoService.GetAll(start, limit);
        JSONObject JsonStore = new JSONObject();
        JsonStore.put("total", AlumnoService.GetAll().size());
        JSONArray JsonDataList = new JSONArray();
        for(AlumnoDto AluLop : AlumnosList)
        {
            JSONObject JsonData = new JSONObject();
            JsonData.put("ideAlu", AluLop.getIdeAlu());
            JsonData.put("nroDni", AluLop.getNroDni());
            JsonData.put("apePat", AluLop.getApePat());
            JsonData.put("apeMat", AluLop.getApeMat());
            JsonData.put("desNom", AluLop.getDesNom());
            JsonData.put("fchNac", AluLop.getFchNac());
            JsonDataList.add(JsonData);
        }
        JsonStore.put("AlumnoListJson", JsonDataList);
        return JsonStore;
    }

    @PostMapping
    public ResponseEntity<Void> Save(@RequestBody AlumnoDto AlumnoDTO)
    {
        AlumnoService.Save(AlumnoDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Void> Update(@RequestBody AlumnoDto AlumnoDTO)
    {
        AlumnoService.Update(AlumnoDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{IdeAlu}")
    public ResponseEntity<Void> Delete(@PathVariable Integer IdeAlu)
    {
        AlumnoService.Delete(new Alumno(IdeAlu));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{IdeAlu}")
    public ResponseEntity<AlumnoDto> GetById(@PathVariable Integer IdeAlu)
    {
        AlumnoDto AlumnoDTO = AlumnoService.GetById(IdeAlu);
        return new ResponseEntity<>(AlumnoDTO, AlumnoDTO == null ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }
}