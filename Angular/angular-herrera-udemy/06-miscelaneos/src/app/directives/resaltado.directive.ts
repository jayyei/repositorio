import { Directive, ElementRef, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appResaltado]'
})
export class ResaltadoDirective {

  constructor(private el: ElementRef) {
    console.log("Directiva llamada", el);
  }

  @Input("appResaltado") nuevoColor:string;

  @HostListener('mouseenter') mouseEnter(){
    this.el.nativeElement.style.backgroundColor = this.nuevoColor||'yellow';
    this.el.nativeElement.style.color='white';
  }
  @HostListener('mouseleave')mouseLeave(){
    this.el.nativeElement.style.backgroundColor=null;
    this.el.nativeElement.style.color='pink';
  }

  }
