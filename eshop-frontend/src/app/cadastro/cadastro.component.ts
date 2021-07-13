import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Cliente } from '../common/cliente';
import { CadastroService } from './cadastro.service';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {
  
  submitted: boolean = false;
  formCadastro!: FormGroup;

  constructor(private cadastroService: CadastroService, private fb: FormBuilder) { }

  ngOnInit(): void {
    this.formCadastro = this.fb.group({
      nome: [null, [Validators.required, Validators.minLength(3), Validators.maxLength(30)]],
      email: [null, [Validators.required, Validators.email]],
      senha: [null, [Validators.required]],
      telefone: [null, [Validators.required]]
    })
  }

  hasError(field: string) {
    return this.formCadastro.get(field)?.errors;
  }

  onSubmit() {
    this.submitted = true;
    
    if (this.formCadastro.valid) {
      console.log(this.formCadastro.value)

      let user: Cliente = {
        'nome': this.formCadastro.value.nome,
        'email': this.formCadastro.value.email,
        'senha': this.formCadastro.value.senha,
        'telefone': this.formCadastro.value.telefone,
      }

      this.cadastroService.addCliente(user).subscribe(
        () => console.log("Cliente cadastrado!")
      );

      this.formCadastro.reset();
      this.submitted = false;
    }
  }
}
