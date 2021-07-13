import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Cliente } from '../common/cliente';
import { LoginService } from './login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  submitted: boolean = false;
  formLogin!: FormGroup;

  constructor(private fb: FormBuilder, private loginService: LoginService) { }

  ngOnInit(): void {
    this.formLogin = this.fb.group({
      email: [null, [Validators.required, Validators.email, Validators.minLength(3), Validators.maxLength(30)]],
      senha: [null, [Validators.required]]
    })
  }

  hasError(field: string) {
    return this.formLogin.get(field)?.errors;
  }

  onSubmit() {
    this.submitted = true;
    
    if (this.formLogin.valid) {
      console.log(this.formLogin.value)

      let user: Cliente = {
        'nome': this.formLogin.value.nome,
        'email': this.formLogin.value.email,
        'senha': this.formLogin.value.senha,
        'telefone': this.formLogin.value.telefone,
      }

      this.loginService.efetuarLogin(user).subscribe(
        () => console.log("Login efetuado!")
      );

      this.formLogin.reset();
      this.submitted = false;
    }
  }

}
