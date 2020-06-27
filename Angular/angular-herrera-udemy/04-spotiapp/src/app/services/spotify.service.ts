import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {map} from 'rxjs/operators';

@Injectable({  //Como el sistema de inyeccion de dependencias, sirve para colocar una sola instancia del servicio en donde se requiera
  providedIn: 'root' //Esta declaracion sirve para evitar aplicar el provider del servicio en el app module, manera auntomatica de importar servicios sin definirlos como providers en el app.module
})
export class SpotifyService {

  constructor(private http: HttpClient) {
    console.log("Servicio de spotify instanciado")
   }

   getQuery(query: string){
    const url = `https://api.spotify.com/v1/${query}`;
    const headers = new HttpHeaders({
      'Authorization': 'Bearer BQA5TGGSdrrFv6osuuGn3aisXRed7ZBfqAxGS3dulOZv8r8slSQXw7-3GoOHVZUb5w-BNyRAhVEjpd2-dkI'
    });
    return this.http.get(url, { headers })
   }

   getNewReleases(){
    return this.getQuery("browse/new-releases?limit=20")
      .pipe( map((data)=>data['albums'].items))
   }

   getArtists(termino:string){
    return this.getQuery(`search?q=${termino}&type=artist&limit=5`)
      .pipe(map((data)=>data['artists'].items))
   }

   getArtist(id:string){
    return this.getQuery(`artists/${id}`)
      //.pipe(map((data)=>data['artists'].items))
   }

   getTopTracks(id:string){
    return this.getQuery(`artists/${id}/top-tracks?country=${'ES'}`)
      .pipe(map((data)=>data['tracks']))
   }

}
