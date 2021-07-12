package br.ufpe.cin.if718.comunicacao;

import br.ufpe.cin.if718.negocio.Cliente;
import br.ufpe.cin.if718.negocio.Fachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CadastroController {
    @Autowired
    private Fachada fachada;

    @PostMapping("/cliente/cadastrar")
    public void cadastrarCliente(@RequestBody Cliente cliente) {
        fachada.cadastrarCliente(cliente);
        System.out.println("Cliente cadastrado.");
    }
}
