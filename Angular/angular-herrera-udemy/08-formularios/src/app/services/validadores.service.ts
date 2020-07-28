import { Injectable } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Observable } from 'rxjs';


  /*let map : { [key: string]: boolean} = {};
    map["foo"] = true;
    map["bar"] = false;
    map.foo = true;
    map["foobar"] = "foo"; // Throws exception
    map[1] = true; // Curiously doesn't throws exception
    Sin ese tipo de retorno, tendrias que especificar todos los atributos del objeto
    como por ejemplo {a:string, b:boolean}
    y el objeto devuelto obligatoriamente devolveria esos atributos con los mismos nombres
    en cambio, con esta devolucion tu puedes devolver cualquier nombre en los atributos
  */

interface ErrorValidate { //Es una interfaz que puede tener una o varias llaves que devuelven booleanos
  [s:string]:boolean
}

@Injectable({
  providedIn: 'root'
})
export class ValidadoresService {

  constructor() { }

  noHerrera(control: FormControl):ErrorValidate{

    if(control.value?.toLowerCase() === 'herrera'){
      return{
        noHerrera:true //Al parecer no importa el nombre
      }
    }
    return null;
  }

  passwordsIguales(pname1:string, pname2:string):Function{
    return (formGroup: FormGroup) => {
      const pass1Control = formGroup.controls[pname1];
      const pass2Control = formGroup.controls[pname2];
      if(pass1Control.value === pass2Control.value){
        pass2Control.setErrors(null);
      }else{
        pass2Control.setErrors({noEsIgual:true})
      }
    }
  }

  existeUsuario(control: FormControl):Promise<ErrorValidate> | Observable<ErrorValidate>{
    if(!control.value){
      return Promise.resolve(null);
    }

    return new Promise((resolve, reject)=>{
      setTimeout(()=>{
        if( control.value === 'strider'){
          resolve({existe:true})
        }
        resolve();
      },3500)
    })
  }

}
