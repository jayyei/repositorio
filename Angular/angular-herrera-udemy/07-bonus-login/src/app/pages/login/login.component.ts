import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UsuarioModel } from 'src/app/models/usuario.model';
import { AuthService } from '../../services/auth.service';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  usuario:UsuarioModel;
  recordarUsuario:boolean = false;

  constructor(private auth: AuthService,
    private router:Router) { }

  ngOnInit() {
    this.usuario = new UsuarioModel();
    if(localStorage.getItem('email')){
      this.usuario.email = localStorage.getItem('email');
      this.recordarUsuario = true
    }
  }

  OnSubmit(loginForm:NgForm):void{
    if(loginForm.invalid){
      return;
    }

    Swal.fire({
      allowOutsideClick: false,
         text:'Espere por favor',
         type:'info'
    });

    Swal.showLoading();

    this.auth.login(this.usuario).subscribe(
      (resp) => {
        console.log(resp);
        Swal.close();
        if(this.recordarUsuario){
          localStorage.setItem('email',this.usuario.email);
        }

        this.router.navigateByUrl('/home');
      }, (err) =>{
        const {error:{error:{message}}} = err;
        Swal.fire({
         text: message,
         title: 'Error al autenticar',
         type:'error'
        });
      }
    )

  }
}
