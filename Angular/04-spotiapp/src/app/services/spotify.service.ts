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
      Authorization: 'Bearer BQBoxd_zFy1p_2u1V2_8eHdl0lKBNdDrfkdyuDtwrH7hvEfbU4LfoXEfFOPSQ-i_ZSd56KxxguyIIJRa120'
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
  }
