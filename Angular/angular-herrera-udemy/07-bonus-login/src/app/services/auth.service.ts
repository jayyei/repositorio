import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UsuarioModel } from '../models/usuario.model';
import { map } from 'rxjs/operators'
@Injectable({
  providedIn: 'root' //Para evitar importar en el app.module
})
export class AuthService {

  private url = 'https://identitytoolkit.googleapis.com/v1';
  private apiKey = 'AIzaSyD_FBplO0ZbkQaoi6OlH39Rw4pZaBQA0iU';

  userToken:string;
  //Crear nuevo usuario
  //  [API_KEY]

  //Ingresar usuario
 //


  constructor(private http: HttpClient) {
    this.leerToken();

   }

  logout(){
    localStorage.removeItem('token')
  }

  login(usuario: UsuarioModel){
    const authData = {
      ...usuario,
      returnSecureToken: true
    }
    return this.http.post(
      `${this.url}/accounts:signInWithPassword?key=${this.apiKey}`,
      authData
    ).pipe(
      map( resp =>{
        this.guardarToken(resp['idToken'], resp['expiresIn']);
        return resp;
      })
    );
  }

  newUser(usuario: UsuarioModel){
    const authData = {
      ...usuario,
      returnSecureToken: true
    }
    return this.http.post(
      `${this.url}/accounts:signUp?key=${this.apiKey}`,
      authData
    ).pipe(
      map( resp =>{
        this.guardarToken(resp['idToken'], resp['expiresIn']);
        return resp;
      })
    );
  }

  private guardarToken( idToken:string, expires:string){
    this.userToken = idToken;
    localStorage.setItem('token',idToken);
    let hoy = new Date();
    hoy.setSeconds(parseInt(expires,10));
    localStorage.setItem('expiresIn', hoy.getTime().toString())
  }

  private leerToken():string{
    if(localStorage.getItem('token')){
      this.userToken = localStorage.getItem('token');
    }else {
      this.userToken = '';
    }
    return this.userToken;
  }

  isAuthenticated():boolean {
    if(this.userToken.length <2){
      return false;
    }
    const expires:number = Number(localStorage.getItem('expiresIn'));
    const expireDate = new Date();
    expireDate.setTime(expires);

    if(expireDate > new Date()){
      return true;
    }else{
      return false;
    }
  }

}
