import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { POST_USER } from '../../endpoint/endpoints';

/*
  Generated class for the LoginProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class LoginProvider {

  constructor(public http: HttpClient) {
    console.log('Si se pudo registrar');
  }

  loginService(user:string, pwd:string){
    return this.http.post(POST_USER,{
      user : user,
      password: pwd});

}
}