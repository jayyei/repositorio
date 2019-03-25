import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';

/**
 * Generated class for the CustomerPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@Component({
  selector: 'page-customer',
  templateUrl: 'customer.html',
})
export class CustomerPage {
  data:any;

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.data = this.navParams.data;

  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad CustomerPage');
  }
  back(){
    this.navCtrl.pop();
  }

  logOut(){
    this.navCtrl.popToRoot();
  }

}
