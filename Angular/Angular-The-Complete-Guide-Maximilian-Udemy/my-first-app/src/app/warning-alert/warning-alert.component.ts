import { Component } from '@angular/core';

@Component({
    selector: 'warning-alert',
    templateUrl: './warning-alert.component.html',
    styleUrls: ['./warning-alert.component.css']
})
export class WarningAlertComponent {
    message = 'El mensaje de advertencia'
}