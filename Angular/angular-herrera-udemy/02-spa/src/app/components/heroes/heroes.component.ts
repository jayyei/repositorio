import { Component, OnInit } from '@angular/core';
import { HeroesService, Heroe } from '../../services/heroes.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styles: [
  ]
})
export class HeroesComponent implements OnInit {

  heroes:Heroe[] = [];
  constructor(private _heroesService:HeroesService,
              private router:Router ) { //Definicion abstracta de atributos de clase, al colocarse asi, se evita tanto asignar el valor al parametro como definir el atributo de la clase
   }

  ngOnInit(): void {
    console.log("ngOnInit");
    this.heroes = this._heroesService.getHeroes();
  }

  verHeroe(idx:number ){
    this.router.navigate(['/heroe', idx])
  }
}
