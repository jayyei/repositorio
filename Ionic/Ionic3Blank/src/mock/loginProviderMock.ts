import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable()
export class LoginProviderMock{

    constructor(private http: HttpClient){
    }

    loginService(){
        return this.http.get('./assets/json/login.json');
    }
}