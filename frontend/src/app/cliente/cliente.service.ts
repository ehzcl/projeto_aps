import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { Cliente } from './cliente';
import { environment } from 'src/environments/environment';
import { of } from 'rxjs';
import { throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getClientes(): Observable<Cliente[]> {
    return this.http.get<Cliente[]>(`${this.apiServerUrl}/clientes/all`);
  }

  public addCliente(cliente: Cliente): Observable<Cliente> {
    return this.http.post<Cliente>(`${this.apiServerUrl}/clientes/create`, cliente)
    .pipe(
      catchError(err => {
        console.error(err);
        if(err.status == 500) {
          return of(err.status);
        }
         return throwError(err.error.message);
      }));
  }

  public getClienteById(idCliente: number): Observable<Cliente> {
    return this.http.get<Cliente>(`${this.apiServerUrl}/clientes/${idCliente}`);
  }
}
