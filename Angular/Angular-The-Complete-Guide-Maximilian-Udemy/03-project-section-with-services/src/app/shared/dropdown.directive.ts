import { Directive, ElementRef, HostBinding, HostListener, Renderer2 } from "@angular/core";

@Directive({
    selector: '[appDropdown]'
})
export class DropdownDirective {

  private wasInside: boolean = false;

  @HostBinding('class.open')
  isOpen = false

  constructor(private elRef: ElementRef, private renderer: Renderer2) {}

  @HostListener('click')
  mouseclick(eventData: Event) {
    // this.renderer.addClass(this.elRef.nativeElement, 'open');
    this.isOpen = true
    this.wasInside = true;
  }

  @HostListener('document:click')
  mouseclickOutside(eventData: Event) {
    if(!this.wasInside) {
      // this.renderer.removeClass(this.elRef.nativeElement, 'open')
      this.isOpen = false
    }
    this.wasInside = false
  }
}