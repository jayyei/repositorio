import { Component, OnInit } from '@angular/core';
import { HeroesService } from '../../services/heroes.service';
import { HeroeModel } from '../../models/heroe.model';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {

  heroes: HeroeModel[] = [];
  loading:boolean = false;

  constructor(private heroesService: HeroesService) { }

  ngOnInit(): void {
    this.loading = true;
    this.heroesService.getHeroes()
      .subscribe(((res:HeroeModel[]) => {
        this.heroes = res;
        this.loading = false;
      }),(err)=>{
        this.loading = false;
      })
  }

  borrarHeroe(heroe: HeroeModel, i : number){

    Swal.fire({
      icon: 'warning',
      title: 'Advertencia',
      text: `Esta seguro que desea borrar a ${heroe.nombre}`,
      showCloseButton: true,
      showCancelButton: true,
      confirmButtonText: '<i class="fa fa-thumbs-up danger"></i> Si',
      confirmButtonAriaLabel: 'Thumbs up, great!',
      cancelButtonText: '<i class="fa fa-thumbs-down">No</i>',
      cancelButtonAriaLabel: 'Thumbs down'
    }).then(res =>{
      if(res.value){
        this.loading = true;
        this.heroesService.borrarHeroe(heroe.id)
        .subscribe(res=>{
          this.heroes.splice(i,1);
          this.loading = false;
        });
      }
    })



  }

}
