import { Component, OnInit, Input, OnChanges } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-tarjetas',
  templateUrl: './tarjetas.component.html',
  styleUrls: ['./tarjetas.component.css']
})
export class TarjetasComponent implements OnChanges {

  @Input() items: any[];

  constructor(private router: Router) {
   }

   ngOnChanges(): void {
    console.log("los items que llegan como props", this.items);
  }

  verArtista(artista:any){
    if(artista.type==='artist'){
      this.router.navigate(['artist', artista['id'] ])
    }
  }

}
