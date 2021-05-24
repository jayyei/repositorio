import { Component, EventEmitter, Output } from "@angular/core";

@Component({
    selector: 'app-header',
    templateUrl: './header.component.html',
    styles: ['./header.component.css']
})
export class HeaderComponent{
    collapsed = true

    @Output()   
    featureSelected = new EventEmitter<string>();

    onSelect(feature: string) {
        this.featureSelected.emit(feature);
    }
}