import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Produto } from './produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutosService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public listarProdutos(): Observable<Produto[]> {
    return this.http.get<Produto[]>(`${this.apiServerUrl}/produtos`);
  }
}
