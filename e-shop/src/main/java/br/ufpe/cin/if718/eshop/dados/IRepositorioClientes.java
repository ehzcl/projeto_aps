package br.ufpe.cin.if718.eshop.dados;

import br.ufpe.cin.if718.eshop.negocio.Cliente;

import java.util.List;

public interface IRepositorioClientes {
    public void inserirCliente(Cliente cliente);
    public Cliente existeCliente(String email);
    public List<Cliente> listarTodosClientes();
}
