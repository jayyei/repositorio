import { Component, OnInit } from '@angular/core';
import { NivelModel } from '../model/nivel-model';
import { DesarroladorModel } from '../model/desarrollador-model';
import { FormBuilder, Validators } from '@angular/forms';
import { DataService } from '../services/data.service';
import { DesarrolladoresService } from '../services/desarrolladores.service';


@Component({
  selector: 'app-simpleform',
  templateUrl: './simpleform.component.html',
  styleUrls: ['./simpleform.component.css']
})
export class SimpleformComponent implements OnInit {
  niveles: NivelModel[];
  // desarrollador: DesarroladorModel;
  constructor(private formBuilder: FormBuilder, private _data: DataService, 
    private desarrolladoresService: DesarrolladoresService){
    
    this.niveles = [
      {id: 1, name: "Senior"},
      {id: 2, name: "Middle"},
      {id: 3, name: "Junior"},
    ];
  }
 RegistroForm = this.formBuilder.group({
   id : [0],
   name : ['', Validators.required],
   apellidoPaterno : ['', Validators.required],
   apellidoMaterno : ['', Validators.required],
   idNivel : [-1, Validators.required]

 })

  ngOnInit() {
  }

  submit(){
    if(this.RegistroForm.valid && this.RegistroForm.value.idNivel >= 0){
    let desarrollador = new DesarroladorModel();
    desarrollador.nombre = this.RegistroForm.value.name;
    desarrollador.apellidoPaterno = this.RegistroForm.value.apellidoPaterno;
    desarrollador.apellidoMaterno = this.RegistroForm.value.apellidoMaterno;
    desarrollador.nivel = this.RegistroForm.value.idNivel;

    this._data.setIsLoadingEvent(true);
    this.desarrolladoresService.save(desarrollador).subscribe(result => {
      this._data.setIsLoadingEvent(false);
      if(result){
        this._data.setGeneralNotificationMessage('registro guardado');
      }else{
        this._data.setGeneralNotificationMessage('entro al servicio pero no guardo');
      }
    }, error =>{
      console.error(error);
      this._data.setIsLoadingEvent(true);
      this._data.setGeneralNotificationMessage('Error al guardar los datos');
    });
    } else {
      this._data.setGeneralNotificationMessage('No te la pellizques');
    }

  }

}
