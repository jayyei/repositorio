import { Component, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  @ViewChild('f')
  basicForm: NgForm; 

  ngEmail = '';
  subscription = '';
  ngPassword = '';

  submitted = false

  defaultSubscription = 'Advanced'

  onSubmit() {
    this.submitted = true;
    this.ngEmail = this.basicForm.value.email
    this.subscription = this.basicForm.value.subscription
    this.ngPassword = this.basicForm.value.password
  }
}
