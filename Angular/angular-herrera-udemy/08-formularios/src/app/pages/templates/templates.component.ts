import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Usuario } from 'src/app/model/usuario';
import { PaisService } from 'src/app/services/pais.service';

@Component({
  selector: 'app-templates',
  templateUrl: './templates.component.html',
  styleUrls: ['./templates.component.css']
})
export class TemplatesComponent implements OnInit {

  carlos:Usuario = {
    nombre : "",
    apellido: "",
    correo: "",
    pais:"",
    genero:''
  }

  paises:any[] = [];

  constructor(private paisService: PaisService) { }

  ngOnInit(): void {
    this.paisService.getPaises('es')
      .subscribe((resp:any[])=>{
        this.paises = resp;
        this.paises.unshift({
          nombre: "Seleccione Pais",
          codigo: ''
        })
      })
  }

  guardar(formulario : NgForm):void{
     //formulario.reset() la referencia local a la forma puede ser utilizada para llamar a su metodo reset
    console.log("Submit disparado", formulario)
    if(formulario.invalid){
      Object.values(formulario.controls) //Devuelve los valores correspondientes a las propiedades de un objeto
        .forEach(formControl => {
          formControl.markAsTouched();
        })
    }
  }
}
