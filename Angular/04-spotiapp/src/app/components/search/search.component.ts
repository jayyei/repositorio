import { Component, OnInit } from '@angular/core';
import { SpotifyService } from 'src/app/services/spotify.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent{

  artistas: any[] = [];
  loading: boolean;
  constructor(private spotify: SpotifyService) {  }
  
  buscar(termino: string){
    if(termino === ''){
      this.loading = false;
      this.artistas = [];
    } else {
    this.loading = true;}
    console.log(termino);
    this.spotify.getArtstas( termino )
        .subscribe( (data: any) => {
          console.log( data );
          this.artistas = data;
          this.loading = false;
        });
  }
    
  }
