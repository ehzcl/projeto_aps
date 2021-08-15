package br.ufpe.cin.if718.eshop.comunicacao;

import br.ufpe.cin.if718.eshop.cliente.Cliente;
import br.ufpe.cin.if718.eshop.negocio.Fachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private Fachada fachada;

    @PostMapping("/login")
    public ResponseEntity efetuarLogin(@RequestBody Cliente cliente) {
        return fachada.buscarCredencial(cliente.getEmail(), cliente.getSenha());
    }
}
