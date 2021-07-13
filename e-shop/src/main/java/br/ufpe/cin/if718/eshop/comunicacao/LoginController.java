package br.ufpe.cin.if718.eshop.comunicacao;

import br.ufpe.cin.if718.eshop.negocio.Cliente;
import br.ufpe.cin.if718.eshop.negocio.Fachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private Fachada fachada;

    @GetMapping("/login")
    public ResponseEntity efetuarLogin(@RequestBody Cliente cliente) {
        Cliente c = fachada.buscarCredencial(cliente.getEmail());
        if (c == null) {
            return new ResponseEntity<Cliente>(HttpStatus.UNAUTHORIZED);
        }
        return c.getSenha().equals(cliente.getSenha()) ?
                new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
