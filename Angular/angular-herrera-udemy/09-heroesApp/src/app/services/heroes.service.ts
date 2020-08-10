import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HeroeModel } from '../models/heroe.model';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HeroesService {

  private URL:string = 'https://login-app-9bbff.firebaseio.com';

  constructor(private httpClient : HttpClient) { }

  crearHeroe(heroe: HeroeModel): Observable<HeroeModel>{
    return this.httpClient.post(`${this.URL}/heroes.json`, heroe)
      .pipe(
        map((res:any) => {
          heroe.id = res.name;
          return heroe;
        })
      );
  }

  actualizarHeroe( heroe: HeroeModel): Observable<Object> {
    const heroeSend = {
      ...heroe
    }
    delete heroeSend.id;
    return this.httpClient.put(`${this.URL}/heroes/${heroe.id}.json`, heroeSend)
  }

  getHeroes():Observable<Object> {
    return this.httpClient.get(`${this.URL}/heroes.json`)
            .pipe(
              map(res =>(
                Object.keys(res).map((key:any):HeroeModel=>{
                  res[key].id = key;
                  return Number(key), res[key]})
              ))
            );
  }

  getHeroe(id:string):Observable<Object> {
    return this.httpClient.get(`${this.URL}/heroes/${id}.json`)
  }

  borrarHeroe(id:string){
    return this.httpClient.delete(`${this.URL}/heroes/${id}.json`);
  }

}
