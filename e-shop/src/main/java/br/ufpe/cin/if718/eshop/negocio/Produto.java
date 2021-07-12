package br.ufpe.cin.if718.eshop.negocio;

public class Produto {
    private Long idProduto;
    private String nome;
    private Double valor;
    public Produto(Long idProduto, String nome, Double valor) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.valor = valor;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
