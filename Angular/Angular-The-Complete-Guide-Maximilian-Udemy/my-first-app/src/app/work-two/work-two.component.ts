import { Component } from "@angular/core";


@Component({
    selector: 'work-two',
    templateUrl: './work-two.component.html'
})
export class WorkTwoComponent {
    username = ''

    resetUsername () {
        this.username = ''
    }
}