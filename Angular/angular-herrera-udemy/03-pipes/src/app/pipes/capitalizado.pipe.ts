import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'capitalizado'
})
export class CapitalizadoPipe implements PipeTransform {

  transform(value: string, todas:boolean=true): string {
    value = value.toLowerCase();
    let arreglo: string[] = value.split(" "); //En el caso de un metodo dentro de la clase en Typescript si es necesario indicar el tipo de variable que sera, porque puede haber mas de varios ambitos dentro de un metodo
    if(todas){
      arreglo.forEach((palabra, index)=>(
        arreglo[index]= palabra.charAt(0).toUpperCase() + palabra.slice(1)
      ))
    } else {
      arreglo[0] = arreglo[0][0].toUpperCase() + arreglo[0].substr(1);
    }
    return arreglo.join(" ");
  }

}
