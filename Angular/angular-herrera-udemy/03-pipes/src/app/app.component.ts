import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
   nombre: string = "Capitan América"; //Atributos de las clases no necesitan el keyword, solo si es necesario, indicar el alcance pero de uso a traves de modificadores de acceso como public, private y protected.
   miNombre: string = "jAy SaNcheZ rAmirEz";
   arreglo2: string[];
   arreglo = [1,2,3,4,5,6,7,8,9,10];
   PI: number = Math.PI;
   porcentaje: number = 0.234;
   salario: number = 1234.5;
   heroe = {
     nombre: 'Logan',
     clave: 'Wolverine',
     edad: 500,
     direccion:{
       calle:'Primera',
       casa: 20
     }
   }
   valorPromesa = new Promise<string>((resolve)=>{
     setTimeout(()=>{
       resolve('llego la data');
     }, 4500)
   });
   fecha:Date = new Date();
   idioma: string = 'en';
   videoUrl: string = "https://www.youtube.com/embed/tKUUqTxu3u0";
   activar: boolean = true;
   changeLang = (ln:string) =>{
     this.idioma = ln
   }

}
