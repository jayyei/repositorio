import { Component, OnInit } from '@angular/core';
import { HeroesService, Heroe } from '../../../services/heroes.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
})
export class NavbarComponent implements OnInit {

  arrHeroes:Heroe[] = [];
  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  buscarHeroe( termino:string ){
    this.router.navigate(['/search', termino])
  }

}
