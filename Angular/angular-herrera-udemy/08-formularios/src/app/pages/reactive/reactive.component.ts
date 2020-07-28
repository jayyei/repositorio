import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormArray } from '@angular/forms';
import { Usuario } from 'src/app/model/usuario-reactive';
import { ValidadoresService } from '../../services/validadores.service';

@Component({
  selector: 'app-reactive',
  templateUrl: './reactive.component.html',
  styleUrls: ['./reactive.component.css']
})
export class ReactiveComponent implements OnInit {

  formulario : FormGroup;

  carlos:Usuario = {
    nombre:['',  //Estos elementos son de tipo formControl
      [Validators.required, Validators.minLength(3)]
    ],
    apellido:['',
      [Validators.required, Validators.minLength(3), this.validadoresService.noHerrera]
    ],
    correo:['',
      [Validators.pattern('[a-z0-9,_%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$'), Validators.required]
    ],
    usuario:['',[Validators.required] , this.validadoresService.existeUsuario], //Es el tercer argumento una validacion asincrona
    pass1:['', [Validators.required]],
    pass2:['', [Validators.required]],
    direccion:this.formBuilder.group({  //Esto es un formGroup anidado, por lo que se considera de tipo formGroup
      distrito:['',
        [Validators.required, Validators.minLength(3)]
      ],
      ciudad:['',
        [Validators.required, Validators.minLength(3)]
      ]
    }),
    pasatiempos: this.formBuilder.array([]) //Este es de tipo formArray
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

  isValidPass(pass1:string, pass2:string):boolean{
    const password1 = this.formulario.get(pass1).value;
    const password2 = this.formulario.get(pass2).value;
    return password1 === password2? true : false;
  }

  get pasatiempos():FormArray {
    return this.formulario.get('pasatiempos') as FormArray;
  }

  constructor(private formBuilder: FormBuilder, private validadoresService: ValidadoresService) {
    this.crearFormulario();
    this.cargarData();
    //this.formulario.reset({ //Resetea los elementos que no estan y los que estan los setea
     // nombre: 'Jay'
    //}); //Para resetear la forma
    this.crearListener()
   }

  ngOnInit(): void {
  }

  private crearFormulario():void {
    //validators recibe una definicion de funcion, lo que sucede es que este servicio en si devuelve una funcion
    this.formulario = this.formBuilder.group(this.carlos,{
      validators: this.validadoresService.passwordsIguales('pass1', 'pass2')
    });
  }

  private cargarData():void{
    this.formulario.setValue({
      nombre: "Jay",
      apellido: "Sanchez",
      correo: "mrjay9628@gmail.com",
      usuario:'',
      pass1:'',
      pass2:'',
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

  private crearListener():void{
    this.formulario.valueChanges.subscribe(valor =>{
      console.log(valor)
    });

    this.formulario.statusChanges.subscribe( status => console.log(status));
    //this.formulario.get('nombre').valueChanges.subscribe(console.log) para especificar los cambios de las validaciones de un solo campo
  }

}
