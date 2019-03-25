import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HeroesService } from 'src/app/service/heroes.service';


@Component({
  selector: 'app-buscador',
  templateUrl: './buscador.component.html',
  styleUrls: ['./buscador.component.css']
})
export class BuscadorComponent implements OnInit {
  heroes:any[] =[];
  termino:string;
  boleano:boolean=true;
  constructor( private activatedRoute:ActivatedRoute,
               private heroesService: HeroesService) { }

  ngOnInit() {
    this.activatedRoute.params.subscribe( params =>{
      //console.log(params['termino']);
      this.termino=params['termino'];
      this.heroes = this.heroesService.buscarHeroes(params['termino']);
      this.boleano= (this.heroes.length>=0) ? true : false;
      console.log(this.heroes);
    })
  }

  onClickedOutside(e: Event) {
    console.log('Clicked outside:', e);
    this.boleano=false;
    console.log("Diste click afuera");
  }


}
