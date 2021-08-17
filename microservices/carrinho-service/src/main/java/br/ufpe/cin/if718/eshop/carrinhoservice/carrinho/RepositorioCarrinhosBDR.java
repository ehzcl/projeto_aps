package br.ufpe.cin.if718.eshop.carrinhoservice.carrinho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositorioCarrinhosBDR implements IRepositorioCarrinho {
    @Autowired
    private CarrinhoDAO carrinhoDAO;

    public void criarCarrinho(Carrinho carrinho) {
        carrinhoDAO.save(carrinho);
    }
}
