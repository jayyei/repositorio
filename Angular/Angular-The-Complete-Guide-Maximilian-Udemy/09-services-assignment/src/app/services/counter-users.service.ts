import { Injectable } from '@angular/core';
import { UsersService } from './users.service';

@Injectable({
  providedIn: 'root'
})
export class CounterUsersService {
  public activeToInactiveCounter = 0;
  public inactiveToActiveCounter = 0;

  incrementActiveToInactive() {
    this.activeToInactiveCounter++;
    console.log('active to inactive ', this.activeToInactiveCounter)
  }
  
  incrementInActiveToActive() {
    this.inactiveToActiveCounter++;
    console.log('inactive to active ', this.inactiveToActiveCounter)
  }


}
