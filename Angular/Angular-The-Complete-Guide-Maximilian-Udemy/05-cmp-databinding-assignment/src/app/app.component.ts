import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  oddNumbers: number[] = [];
  evenNumbers: number[] = [];

  getStartGame(counter: number) {
    console.log('the number: ', counter)
    if(counter % 2 !== 0) {
      this.oddNumbers.push(counter)
      return
    }
    this.evenNumbers.push(counter)
  }

  getStopGame(counter: number) {
    console.log('the reset number ', counter)
  }
}
