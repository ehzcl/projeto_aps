package br.ufpe.cin.if718.eshop.cliente;

import br.ufpe.cin.if718.eshop.cliente.Cliente;

import java.util.List;

public interface IRepositorioClientes {
    void inserirCliente(Cliente cliente);
    Cliente existeCliente(String email);
}
