import { Component, OnInit } from '@angular/core';

@Component({
  // selector: '[app-servers]', //Con corchetes el selector sirve como atributo
  // selector: '.app-servers',
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {

  allowNewServer = false;
  serverCreationStatus = 'No server was created'
  serverName = 'Test Server Name'
  serverCreated = false;
  servers= ['TestServer', 'TestServer 2']

  constructor() {
    setTimeout(()=>{
      this.allowNewServer = true;
    },2000)
   }

  ngOnInit(): void {
  }

  onCreateServer(e) {
    this.serverCreated = true
    this.servers.push(this.serverName);
    this.serverCreationStatus = 'Server was created Name is ' + this.serverName
  }

  onUpdateServerName(event: any) {
    this.serverName = (<HTMLInputElement>event.target).value
  }

}
