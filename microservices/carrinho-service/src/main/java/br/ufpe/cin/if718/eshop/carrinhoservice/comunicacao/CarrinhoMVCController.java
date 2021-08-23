package br.ufpe.cin.if718.eshop.carrinhoservice.comunicacao;

import br.ufpe.cin.if718.eshop.carrinhoservice.carrinho.ControladorCarrinho;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class CarrinhoMVCController {
    @Autowired
    private ControladorCarrinho controladorCarrinho;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/carrinho/add/{id}")
    public ResponseEntity criarCarrinho(@PathVariable Long id) {
        log.info("criarCarrinho dentro de CarrinhoMVCController");
        return controladorCarrinho.criarCarrinho(id);
    }
}
