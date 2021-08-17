import { Component, OnInit } from '@angular/core';
import { Produto } from './produto';
import { ProdutosService } from './produtos.service';

@Component({
  selector: 'app-produtos',
  templateUrl: './produtos.component.html',
  styleUrls: ['./produtos.component.css']
})
export class ProdutosComponent implements OnInit {

  produtos: Produto[] = [];

  constructor(private produtosService: ProdutosService) { }

  ngOnInit(): void {
    this.produtosService.listarProdutos().subscribe(
      data => {
        this.produtos = data;
        console.log(this.produtos);
      }
    );
  }

}
