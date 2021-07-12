package br.ufpe.cin.if718.negocio;

public class Carrinho {
    private Integer idCliente;
    // private Produto[] produtos;
    private Double valorTotal;

    public Carrinho(Integer idCliente, Produto[] produtos, Double valorTotal) {
        this.idCliente = idCliente;
        // this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
