import { Component, OnInit } from '@angular/core';
import { SpotifyService } from 'src/app/services/spotify.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  nuevasCanciones: any[] = [];
  loading: boolean;
  error: boolean;

  constructor( private spotify: SpotifyService) {
      this.loading = true;
      this.error = false;
      this.spotify.getNewReleases()
          .subscribe( (data: any) =>{
            console.log(data);
            this.nuevasCanciones = data;
            this.loading = false;
          }, ( errorService ) => {
            this.loading = false;
            this.error = true;
            console.log(errorService);
          } );
   }

}
