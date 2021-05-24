import { Injectable } from '@angular/core';
import { CounterUsersService } from './counter-users.service';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  public activeUsers = ['Max', 'Anna'];
  
    
  public inactiveUsers = ['Chris', 'Manu'];
  

  constructor(private counterUsersService: CounterUsersService) { }

  onSetToInactive(id: number) {
    this.inactiveUsers.push(this.activeUsers[id]);
    this.activeUsers.splice(id, 1);
    this.counterUsersService.incrementInActiveToActive();
  }

  onSetToActive(id: number) {
    this.activeUsers.push(this.inactiveUsers[id]);
    this.inactiveUsers.splice(id, 1);
    this.counterUsersService.incrementActiveToInactive();
  }
}
