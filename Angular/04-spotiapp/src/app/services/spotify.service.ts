import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class SpotifyService {

  constructor(private http: HttpClient) {
    console.log('Spotify service works');
   }

   getQuery(query: string){
    const url = `https://api.spotify.com/v1/${query}`;

    const headers = new HttpHeaders({
      Authorization: 'Bearer BQBTY-o5EOAlCuUpIfnpqOytghxQidGjf85p_RAUB8J42olNAwkID3BXLS84agmg4fC0VQr30TSl4CFD8Xs'
    });
    return this.http.get(url, {headers} );
   }

   getNewReleases() {
    return this.getQuery('browse/new-releases')
                    .pipe( map( (data: any) => data.albums.items));
   }

   getArtstas(termino: string) {
    return this.getQuery(`search?q=${termino}&type=artist&limit=15`)
                    .pipe( map((data: any) => data.artists.items));
   }

   getArtista(id: string) {
    return this.getQuery(`artists/${ id}`);
                    // .pipe( map((data: any) => data.artists.items));
   }

   getTopTracks(id: string) {
    return this.getQuery(`artists/${ id}/top-tracks?country=us`)
               .pipe( map ( (data: any) => data.tracks));
                    // .pipe( map((data: any) => data.artists.items));
   }
  }
