package br.ufpe.cin.if718.eshop.comunicacao;

import br.ufpe.cin.if718.eshop.negocio.Cliente;
import br.ufpe.cin.if718.eshop.negocio.Fachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @Autowired
    private Fachada fachada;

    @PostMapping("/login")
    public ResponseEntity efetuarLogin(@RequestBody Cliente cliente) {
        fachada.efetuarLogin(cliente.getEmail(), cliente.getSenha());
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
