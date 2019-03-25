import { Component, OnInit } from '@angular/core';
import { HeroesService, Heroe } from 'src/app/service/heroes.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-heroe',
  templateUrl: './heroe.component.html',
  styleUrls: ['./heroe.component.css']
})
export class HeroeComponent {

  heroe:any = {};
  boleano:boolean = true;
  constructor(  private heroesService:HeroesService,
               private activatedRouted: ActivatedRoute) { 
    this.activatedRouted.params.subscribe( params =>{
      this.heroe = this.heroesService.getHeroe(params['id']);
      console.log(this.heroe);
    })  
  
  }

  // onClickedOutside(e: Event) {
  //   console.log('Clicked outside:', e);
  //   this.boleano= (this.boleano==true) ? false : true;
  //   console.log("Diste click afuera");
  // }


}
