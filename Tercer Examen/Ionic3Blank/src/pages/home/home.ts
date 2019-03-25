import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { AboutPage } from '../about/about';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CreateAccountPage } from '../create-account/create-account';
import { LoginProvider } from '../../providers/login/login';
import { EventManagerProvider } from '../../providers/event-manager/event-manager';
import { CustomerPage } from '../customer/customer';

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
  constructor(public navCtrl: NavController, private fb: FormBuilder, private login_provider: LoginProvider, private events_manager: EventManagerProvider) {
      this.loginForm = this.fb.group({
        user: ['', Validators.required],
        pwd: ['', Validators.required]
      });

  }

  login(){
    this.events_manager.setIsLoading(true);
    
    this.login_provider.loginService(
      this.loginForm.get('user').value,this.loginForm.get('pwd').value)
      .subscribe((response) => {
        console.log(response);
        this.events_manager.setIsLoading(false);
        this.navCtrl.push(CustomerPage,response);
      }, error => {
        this.events_manager.setIsLoading(false);
        this.events_manager.setMsgToast(error.error.message);
        console.log(error)});
      }
      
      
    
  
  //   let data = {user:this.user,group:this.group, cursos:this.cursos, date:new Date, money: this.money};
  //   console.log(data);
  //   // debugger
  //   this.navCtrl.push(AboutPage,data);
  // }

  createUser(){
    this.navCtrl.push(CreateAccountPage);

  }

  viewAndDelete(){
    this.navCtrl.push(AboutPage);
  }

}
