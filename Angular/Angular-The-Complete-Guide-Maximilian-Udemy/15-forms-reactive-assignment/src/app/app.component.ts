import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  statusOptions: string[] = ['Stable', 'Critical', 'Finished']
  projectForm: FormGroup;

  ngOnInit() {
    this.projectForm = new FormGroup({
      'name': new FormControl(null, [Validators.required, this.myValidator], [this.myValidatorAsync]),
      'mail': new FormControl(null, [Validators.required]),
      'status': new FormControl(null )
    })
  }

  myValidator(control: FormControl): {[s: string]: boolean} {
    if (control.value === 'Test') {
      return {
        'test': true
      }
    }
    return null
  }
  myValidatorAsync(control: FormControl): Promise<any> | Observable<any> {
    return new Promise<any> ((resolve, reject) => {
      setTimeout(()=> {
        if (control.value === 'TestAsync') {
          resolve({'testAsync': true})
        } else {
          resolve(null)
        }
      }, 3000)
    })
  }

  onSubmit() {
    console.log(this.projectForm)
  }
}
