import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { SpotifyService } from '../../services/spotify.service';
@Component({
  selector: 'app-artista',
  templateUrl: './artista.component.html',
  styles: [
  ]
})
export class ArtistaComponent implements OnInit {

  artista: any = {};
  loading:boolean = false;
  topTracks: any =[];

  constructor(private activatedRoute: ActivatedRoute,
      private spotify: SpotifyService) {
    this.loading = true;
    this.activatedRoute.params.subscribe( params => {
      spotify.getArtist(params['id']).subscribe(data=>{
        this.artista = data;
        this.loading = false;
      });
      this.spotify.getTopTracks(params['id']).subscribe(data=>{
        this.topTracks= data;
        console.log("Los topTracks", data)
      })
    })
  }

  ngOnInit(): void {
  }

  getPath(uri: string): string {
    return `https://open.spotify.com/embed/album/${uri}`;
  }
}
