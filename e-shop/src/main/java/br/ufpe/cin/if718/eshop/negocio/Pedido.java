package br.ufpe.cin.if718.eshop.negocio;


public class Pedido {
    private Long idPedido;
    private Integer idCliente;
    private Produto produtos;
    private Integer valorTotal;

    public Pedido(Integer idCliente, Produto produtos, Integer valorTotal) {
        this.idCliente = idCliente;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public Integer getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Integer valorTotal) {
        this.valorTotal = valorTotal;
    }
}
