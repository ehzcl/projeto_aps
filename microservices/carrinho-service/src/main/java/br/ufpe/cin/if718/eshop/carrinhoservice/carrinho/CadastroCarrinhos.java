package br.ufpe.cin.if718.eshop.carrinhoservice.carrinho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CadastroCarrinhos {
    @Autowired
    private IRepositorioCarrinho repositorioCarrinho;

    public ResponseEntity inserirCarrinho(Long id) {
        Carrinho temp = new Carrinho(id, 0.00);
        repositorioCarrinho.criarCarrinho(temp);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
