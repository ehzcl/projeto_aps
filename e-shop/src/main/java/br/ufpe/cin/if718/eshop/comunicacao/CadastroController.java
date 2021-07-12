package br.ufpe.cin.if718.eshop.comunicacao;

import br.ufpe.cin.if718.eshop.negocio.Cliente;
import br.ufpe.cin.if718.eshop.negocio.Fachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class CadastroController {
    @Autowired
    private Fachada fachada;

    @PostMapping("/cadastrar")
    public ResponseEntity cadastrarCliente(@RequestBody Cliente cliente) {
        fachada.cadastrarCliente(cliente);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
