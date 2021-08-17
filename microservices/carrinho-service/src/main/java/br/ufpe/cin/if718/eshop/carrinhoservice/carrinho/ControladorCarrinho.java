package br.ufpe.cin.if718.eshop.carrinhoservice.carrinho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ControladorCarrinho {
    @Autowired
    private CadastroCarrinhos cadastroCarrinhos;

    public ResponseEntity criarCarrinho(Long id) {
        return cadastroCarrinhos.inserirCarrinho(id);
    }
}
