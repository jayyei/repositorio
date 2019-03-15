import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { CustomerPage } from '../customer/customer';
import { HomePage } from '../home/home';
import { StudentsProvider } from '../../providers/students/students';
import { EventManagerProvider } from '../../providers/event-manager/event-manager';
import { NewUser } from '../../model/students-models';

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
  students: any[] = [];
  

  constructor(public navCtrl: NavController, public navParams: NavParams, private student_provider: StudentsProvider, private event_manager: EventManagerProvider) {
     this.data = this.navParams.data;
     this.loadStudent();
    
    // this.user = this.navParams.get('user');
    // this.money = this.navParams.get('money');
    // this.cursos = this.navParams.get('cursos');
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

  deleteCard(student){
    console.log(student);
   
    this.event_manager.setIsLoading(true);
    this.student_provider.deleteStudent(student)
      .subscribe(() => {
        this.event_manager.setIsLoading(false);
        this.loadStudent();
        this.event_manager.setMsgToast("Se elimino correctamente");
      }, error => {
        this.event_manager.setIsLoading(false);
        this.event_manager.setMsgToast(error.error.message);
        console.log(error);        
      });
  }

  loadStudent(){  this.student_provider.getstudents().subscribe(( response:any) =>{
    this.students = response;
   },error =>{
      console.log(error);
    }
  );

  }
}
