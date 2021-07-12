package br.ufpe.cin.if718.dados;

import br.ufpe.cin.if718.negocio.Cliente;

public interface IRepositorioClientes {
    public void inserirCliente(Cliente cliente);
    public Cliente existeCliente(String email, String senha);
    public void adicionarFavorito(Long idCliente, Long idProduto);
}
