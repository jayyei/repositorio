import { Component } from '@angular/core';
import { SpotifyService } from '../../services/spotify.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styles: [
  ]
})
export class SearchComponent {

  artistas: any[] = [];
  loading:boolean=false;
  message:string;
  constructor(private spotify: SpotifyService) { }

  buscar(termino:any){

    this.loading=true;

    this.spotify.getArtists(termino)
      .subscribe((data:any) =>{
        this.artistas = data;
        this.loading = false;
      },(err)=>{
        this.loading = false;
        this.artistas = [];
        this.message = err.error.error.message;
      })
  }

  catchOverMessage(isOverMessage: boolean):void{
    if(!isOverMessage) this.message = "";
  }
}
