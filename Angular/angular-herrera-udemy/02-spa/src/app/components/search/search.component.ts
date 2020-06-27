import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HeroesService, Heroe } from '../../services/heroes.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styles: [
  ]
})
export class SearchComponent implements OnInit {
  searchHeroes: Heroe[];
  termino: string;

  constructor(private activatedRoute: ActivatedRoute,
    private heroesService:HeroesService, private router:Router) { }

  ngOnInit(): void {
    this.activatedRoute.params.subscribe(params =>{
      this.termino = params.termino;
      this.searchHeroes = this.heroesService.buscarHeroes(this.termino);
      console.log("El searchHeroes", this.searchHeroes);
    })
  }

  verHeroe( idx:number ){
    this.router.navigate(['/heroe', idx])
  }

}
