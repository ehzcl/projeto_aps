package br.ufpe.cin.if718.eshop.cadastroservice.cliente;

public interface IRepositorioClientes {
    void inserirCliente(Cliente cliente);
    Cliente existeCliente(String email);
}
