import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { UsersService } from '../services/users.service';

@Component({
  selector: 'app-inactive-users',
  templateUrl: './inactive-users.component.html',
  styleUrls: ['./inactive-users.component.css']
})
export class InactiveUsersComponent implements OnInit{

  users = []
  constructor(private usersService: UsersService) {}

  ngOnInit () {
    // Porque users puede cambiar y reflejar cambios? porque se pasa valor por referencia
    this.users = this.usersService.inactiveUsers
  }

  onSetToActive(id: number) {
    this.usersService.onSetToActive(id);
  }
}
