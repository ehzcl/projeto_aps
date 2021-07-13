import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Cliente } from '../common/cliente';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public efetuarLogin(cliente: Cliente): Observable<Cliente> {
    return this.http.post<Cliente>(`${this.apiServerUrl}/login`, cliente);
  }
}
