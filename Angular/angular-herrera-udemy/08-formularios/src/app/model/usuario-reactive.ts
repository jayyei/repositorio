import { FormGroup, FormArray } from '@angular/forms';
export type Usuario = {
  nombre:any[],
  apellido:any[],
  correo:any[],
  usuario:any[],
  pass1:any[],
  pass2:any[],
  direccion: FormGroup,
  pasatiempos: FormArray
}
