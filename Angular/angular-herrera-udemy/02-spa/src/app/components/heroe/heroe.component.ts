import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HeroesService, Heroe } from '../../services/heroes.service';

@Component({
  selector: 'app-heroe',
  templateUrl: './heroe.component.html',
  styles: [
  ]
})
export class HeroeComponent {

  heroe:Heroe;
  heroesService:HeroesService;

  constructor(private activatedRoute: ActivatedRoute,
    heroesService:HeroesService) {
    this.heroesService = heroesService; //Otra forma de definir de manera mas explicita un atributo dentro de un cosntructor, es definiendo el atributo, y dentro del constructor, asignar el valor a this

    this.activatedRoute.params.subscribe(params => {
      this.heroe = this.heroesService.getHeroe(params['id']);
      console.log(this.heroe)
    })
   }


}
