import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { AboutPage } from '../about/about';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  user:string;
  group:string;
  money: number;
  cursos:string[] = ['Ionic', 'angular','Net','Docker']
  constructor(public navCtrl: NavController) {


  }

  goAbout(){
    let data = {user:this.user,group:this.group, courses:this.cursos, date:new Date, money: this.money};
    console.log(data);
    // debugger
    this.navCtrl.push(AboutPage,data);
  }

}
