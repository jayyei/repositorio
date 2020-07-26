import { FormGroup, FormArray } from '@angular/forms';
export type Usuario = {
  nombre:any[],
  apellido:any[],
  correo:any[],
  direccion: FormGroup,
  pasatiempos: FormArray
}
