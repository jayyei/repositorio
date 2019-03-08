import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { $ } from 'protractor';


@Component({
  selector: 'app-hola-mundo',
  templateUrl: './hola-mundo.component.html',
  styleUrls: ['./hola-mundo.component.css']
})
export class HolaMundoComponent implements OnInit {
  @Input() message: string
  @Output() Messageoutput = new EventEmitter<String>();

  constructor() { }

  ngOnInit() {
    this.Messageoutput.emit(this.message);
  }
clickLike(message: string){
  this.Messageoutput.emit(`Me gusto el chiste, ${message} `);
}
}
