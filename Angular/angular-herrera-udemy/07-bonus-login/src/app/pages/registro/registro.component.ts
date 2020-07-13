import { Component, OnInit } from '@angular/core';
import { UsuarioModel } from 'src/app/models/usuario.model';
import { getMaxListeners } from 'process';
import { NgForm } from '@angular/forms';
import { AuthService } from 'src/app/services/auth.service';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {

  usuario: UsuarioModel;
  recordarUsuario:boolean = false;

  constructor(private auth:AuthService,
      private router:Router) { }

  ngOnInit() {
    this.usuario = new UsuarioModel();
   }

   onSubmit(registroForm: NgForm){

    if(registroForm.invalid){
      return;
    }

    Swal.fire({
      allowOutsideClick: false,
         text:'Espere por favor',
         type:'info'
    });
    Swal.showLoading();

     this.auth.newUser(this.usuario)
      .subscribe(resp => {
        console.log(resp);
        Swal.close();
        if(this.recordarUsuario){
          localStorage.setItem('email', this.usuario.email)
        }
        this.router.navigateByUrl('/home');
      }, (err)=>{
        const {error:{error:{message}}} = err;
        Swal.fire({
          text: message,
          title: 'Error al autenticar',
          type:'error'
         });
      })
   }


}
