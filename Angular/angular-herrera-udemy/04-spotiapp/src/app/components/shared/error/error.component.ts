import { Component, OnInit, Input, OnChanges, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-error',
  templateUrl: './error.component.html',
  styleUrls: ['./error.component.css']
})
export class ErrorComponent implements OnChanges {

  @Output() isOverMessage = new EventEmitter<boolean>();
  @Input() description: string;
  isLoading:boolean;
  constructor() { }

  ngOnChanges(): void {
    if(this.description !== ""){
      this.isLoading = true;
      setTimeout(()=>{
        this.isLoading = false;
        this.isOverMessage.emit(false);
      },5000)
    }
  }

}
