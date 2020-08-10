import { Component, OnInit } from '@angular/core';
import { HeroeModel } from '../../models/heroe.model';
import { NgForm } from '@angular/forms';
import { HeroesService } from '../../services/heroes.service';
import Swal from 'sweetalert2';
import { Observable } from 'rxjs';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-heroe',
  templateUrl: './heroe.component.html',
  styleUrls: ['./heroe.component.css']
})
export class HeroeComponent implements OnInit {

  heroe:HeroeModel = new HeroeModel();

  constructor(private heroesService: HeroesService,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.paramMap.get('id');
    if(id !== 'nuevo'){
      this.heroesService.getHeroe(id)
        .subscribe((res:HeroeModel) =>{
          this.heroe = {id, ...res,};
        })
    }
  }

  guardar(formulario: NgForm){
    if(formulario.invalid){
      return;
    }

    Swal.fire({
      icon: 'info',
      title: 'Espere',
      text: 'Guardando informacion',
      allowOutsideClick:false
    });
    Swal.showLoading();

    let peticion: Observable<any>
    if(this.heroe.id){
     peticion = this.heroesService.actualizarHeroe(this.heroe)
    }else{
     peticion = this.heroesService.crearHeroe(this.heroe)
    }

    peticion.subscribe( resp =>{
      Swal.fire({
        icon: 'success',
        title: this.heroe.nombre,
        text: 'Se actualizo correctamente',
      })
    })

  }

}
