import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-game-control',
  templateUrl: './game-control.component.html',
  styleUrls: ['./game-control.component.css']
})
export class GameControlComponent implements OnInit {

  @Output()
  startGame = new EventEmitter<number>()

  @Output()
  stopGame = new EventEmitter<number>()

  counter: number = 0

  interval: any

  constructor() { }

  ngOnInit(): void {
  }

  onStartGame() {
    this.interval = setInterval(()=>{
      this.startGame.emit(this.counter += 1)
    }, 1000)
  }

  onStopGame() {
    clearInterval(this.interval)
    this.stopGame.emit(0);
    this.counter = 0
  }

}
