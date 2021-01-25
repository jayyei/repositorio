import { Component } from '@angular/core'

@Component({
    selector: 'success-alert',
    template: `
        <div>
            {{ message }}
        </div>
    `,
    styles:[ `
        div {
            color: white;
            background: green;
            padding: 5px;
            text-align: center;
        }
    `]
})
export class SuccessAlertComponent {
    message = 'Soy el mensaje de alerta'
}