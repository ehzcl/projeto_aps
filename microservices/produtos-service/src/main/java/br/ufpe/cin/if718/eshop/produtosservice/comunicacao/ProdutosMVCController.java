package br.ufpe.cin.if718.eshop.produtosservice.comunicacao;

import br.ufpe.cin.if718.eshop.produtosservice.produto.ControladorProduto;
import br.ufpe.cin.if718.eshop.produtosservice.produto.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ProdutosMVCController {
    @Autowired
    private ControladorProduto controladorProduto;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/produtos")
    public Produto[] listarProdutos() throws IOException, InterruptedException {
        return controladorProduto.listarProdutos();
    }
}
