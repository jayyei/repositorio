import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { AboutPage } from '../about/about';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  user:string;
  group:string;
  money: number;
  cursos:string[] = ['Ionic', 'angular','Net','Docker'];
  loginForm:FormGroup;
  constructor(public navCtrl: NavController, private fb: FormBuilder) {
      this.loginForm = this.fb.group({
        user: ['', Validators.required],
        pwd: ['', Validators.required]
      });

  }

  login(){
    let data = {user:this.user,group:this.group, cursos:this.cursos, date:new Date, money: this.money};
    console.log(data);
    // debugger
    this.navCtrl.push(AboutPage,data);
  }

}
