import { Component } from '@angular/core';
import { AccountsService } from '../accounts.service';
import { LoggingService } from '../logging.service';


// Se pueden proveer servicios de forma directa en los componentes
@Component({
  selector: 'app-new-account',
  templateUrl: './new-account.component.html',
  styleUrls: ['./new-account.component.css']
})
export class NewAccountComponent {

  constructor(private loggingService: LoggingService,
    private accountsService: AccountsService){
      this.accountsService.statusUpdated.subscribe(
        (status: string) => alert('New Status: ' + status)
      )
    }

  onCreateAccount(accountName: string, accountStatus: string) {
    this.accountsService.addAccount(accountStatus, accountStatus)
    // this.loggingService.logStatusChange(accountStatus)
  }
}
