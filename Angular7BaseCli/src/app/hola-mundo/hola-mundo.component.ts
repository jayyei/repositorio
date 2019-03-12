import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { DataService} from '../services/data.service';
import { $ } from 'protractor';


@Component({
  selector: 'app-hola-mundo',
  templateUrl: './hola-mundo.component.html',
  styleUrls: ['./hola-mundo.component.css']
})
export class HolaMundoComponent implements OnInit {
  @Input() message: string
  @Output() Messageoutput = new EventEmitter<String>();

  constructor(private _data: DataService ) {
       }

  ngOnInit() {
    this.Messageoutput.emit(this.message);
  }
clickLike(message: string){
  this.Messageoutput.emit(`Me gusto el chiste, ${message} `);
}
buttonShare(message: string){
  // this.Messageoutput.emit(`Compartire el chiste, ${message} `);
  this._data.setGeneralNotificationMessage(`Que onda`);
  // this._data.getGeneralNotificationMessage();
}
}
