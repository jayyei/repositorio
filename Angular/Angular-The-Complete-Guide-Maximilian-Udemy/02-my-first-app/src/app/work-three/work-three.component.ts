import { Component } from "@angular/core";

@Component({
    selector: 'work-three',
    templateUrl: './work-three.component.html',
    styles: [`
        .blue-color {
            background-color: blue;
            color: white;
        }
    `]
})
export class WorkThreeComponent {
    isVisible = false
    counter = 0
    counts = []

    handleClick () {
        this.counter ++;
        this.isVisible = ! this.isVisible;
        this.counts.push(this.counter);
    }
}