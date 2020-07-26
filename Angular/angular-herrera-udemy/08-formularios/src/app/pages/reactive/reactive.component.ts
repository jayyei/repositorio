import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormArray } from '@angular/forms';
import { Usuario } from 'src/app/model/usuario-reactive';

@Component({
  selector: 'app-reactive',
  templateUrl: './reactive.component.html',
  styleUrls: ['./reactive.component.css']
})
export class ReactiveComponent implements OnInit {

  formulario : FormGroup;

  carlos:Usuario = {
    nombre:['',
      [Validators.required, Validators.minLength(3)]
    ],
    apellido:['',
      [Validators.required, Validators.minLength(3)]
    ],
    correo:['',
      [Validators.pattern('[a-z0-9,_%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$'), Validators.required]
    ],
    direccion:this.formBuilder.group({  //Esto es un formGroup anidado
      distrito:['',
        [Validators.required, Validators.minLength(3)]
      ],
      ciudad:['',
        [Validators.required, Validators.minLength(3)]
      ]
    }),
    pasatiempos: this.formBuilder.array([])
  }

  //Los getter y setter en typescript son algo abstractos, por lo que su definición contiene las palabras get y set
  // pero su llamado es diferente, por ejemplo al llamar
  // bar: se llamaria su getter
  // bar = true : se llamaria su setter

  isValid(element:string):boolean{
    //Recuerda: return a && b : devolvera b si solo a es distinto de undefined o null
    return this.formulario.get(element).invalid &&
      this.formulario.get(element).touched
  }

  get pasatiempos():FormArray {
    return this.formulario.get('pasatiempos') as FormArray;
  }

  constructor(private formBuilder: FormBuilder) {
    this.crearFormulario();
    this.cargarData();
    //this.formulario.reset({ //Resetea los elementos que no estan y los que estan los setea
     // nombre: 'Jay'
    //}); //Para resetear la forma
   }

  ngOnInit(): void {
  }

  private crearFormulario():void{
    this.formulario = this.formBuilder.group(this.carlos);
  }

  private cargarData():void{
    this.formulario.setValue({
      nombre: "Jay",
      apellido: "Sanchez",
      correo: "mrjay9628@gmail.com",
      direccion: {
        distrito:"1123",
        ciudad: "Ecatepec"
      },
      pasatiempos:[]
    })
    let initialArray:any[] = ["initial", "initial2"]
    initialArray.forEach(element=>{
      this.pasatiempos.push(this.formBuilder.control(element));
    })
  }

  agregarPasatiempo():void{
    this.pasatiempos.push(
      this.formBuilder.control('Nuevo elemento', [Validators.required]))
  }

  borrarPasatiempo(i:number):void{
    this.pasatiempos.removeAt(i);
  }

  guardar(){
    if(this.formulario.invalid){
      Object.values(this.formulario.controls)
        .forEach(formControl=>{
          formControl.markAsTouched();
          if(formControl instanceof FormGroup){
            Object.values(formControl.controls).forEach(formControlChild =>{
              formControlChild.markAsTouched();
            })
          }
        })
        return;
    }
    console.log("El formulario ", this.formulario)
  }

}
