package br.ufpe.cin.if718.eshop.dados;

public interface RepositorioAbstractFactory {
    public IRepositorioClientes repositorioClientes();
    public IRepositorioCarrinhos repositorioCarrinhos();
    public IRepositorioProdutos repositorioProdutos();
    public IRepositorioPedidos repositorioPedidos();
}
