import { Component, OnInit } from '@angular/core';
import { SpotifyService } from '../../services/spotify.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
})
export class HomeComponent {

  nuevasCanciones: any[] = [];
  loading:boolean=false;
  message:string;

  constructor(private spotify: SpotifyService){
    this.loading = true
    this.spotify.getNewReleases()
      .subscribe((data:any) =>{
        this.nuevasCanciones = data;
        this.loading = false;
      },(error)=>{
        this.loading = false;
      this.message = error.error.error.message
    });
  }

}
