package br.ufpe.cin.if718.eshop.dados;

import br.ufpe.cin.if718.eshop.negocio.Cliente;

public interface IRepositorioClientes {
    public void inserirCliente(Cliente cliente);
    public Cliente existeCliente(String email, String senha);
    public void adicionarFavorito(Long idCliente, Long idProduto);
    public Iterable<Cliente> getAll();
}
