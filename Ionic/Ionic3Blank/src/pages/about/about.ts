import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { CustomerPage } from '../customer/customer';
import { HomePage } from '../home/home';

/**
 * Generated class for the AboutPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@Component({
  selector: 'page-about',
  templateUrl: 'about.html',
})
export class AboutPage {

  user:string;
  money:number;
  cursos:string[];
  //group:string;
  data:any;
  colorLabel: string ='secondary';

  constructor(public navCtrl: NavController, public navParams: NavParams) {
     this.data = this.navParams.data;
    this.user = this.navParams.get('user');
    this.money = this.navParams.get('money');
    this.cursos = this.navParams.get('cursos');
    //this.group = this.navParams.get('group');
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad AboutPage');
  }

  goCustomer() {
    setTimeout(() =>{
      this.colorLabel ='danger';
    },3*1000)
  }
  back(){
    this.navCtrl.pop();
  }

  logOut(){
    this.navCtrl.popToRoot();
  }

  next(){
    this.navCtrl.push(CustomerPage);
  }

}
