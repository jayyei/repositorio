import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { NewUser } from '../../model/students-models';
import { CREATE_USER, GET_USER, DELETE_USER } from '../../endpoint/endpoints';

/*
  Generated class for the StudentsProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class StudentsProvider {

  constructor(public http: HttpClient) {
    console.log('Hello StudentsProvider Provider');
  }

  createAccountStudent( account : NewUser){
    return this.http.post(CREATE_USER, account);
  }

  getstudents(){
    return this.http.get(GET_USER);
  }

  deleteStudent(id:number){
    return this.http.delete(`${DELETE_USER}${id}`);
  }

  
}
