import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente/cliente';
import { ClienteService } from './cliente/cliente.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'eshop-frontend';
  
  public clientes: Cliente[] = [];
  registrationForm!: FormGroup;

  constructor(private clienteService: ClienteService,
    private fb: FormBuilder) {}

  ngOnInit() {
    this.initPassForm();
  }

  initPassForm() {
    this.registrationForm = this.fb.group({
      nome: ["", [Validators.required]],
      email: ["", [Validators.required, Validators.email]],
      senha: ["", Validators.required],
      telefone: ["", Validators.required],
    });
  }

  signUp(){
    let user: Cliente = {
      'nome': this.registrationForm.value.nome,
      'email': this.registrationForm.value.email,
      'senha': this.registrationForm.value.senha,
      'telefone': this.registrationForm.value.telefone,
    }
    this.clienteService.addCliente(user).subscribe(
      () => console.log("Cliente cadastrado!")
    );
  }

  public getClientes(): void {
    this.clienteService.getClientes().subscribe(
      (response: Cliente[]) => {
        this.clientes = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
