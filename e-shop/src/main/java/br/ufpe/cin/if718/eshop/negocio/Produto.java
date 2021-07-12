package br.ufpe.cin.if718.eshop.negocio;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
