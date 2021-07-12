package br.ufpe.cin.if718.eshop.comunicacao;

import br.ufpe.cin.if718.eshop.negocio.Cliente;
import br.ufpe.cin.if718.eshop.negocio.Fachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private Fachada fachada;

    @GetMapping("/all")
    public ResponseEntity<List<Cliente>> listarTodosClientes() {
        List<Cliente> clientes = fachada.listarTodosClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente) {
        Cliente c = fachada.buscarCredencial(cliente.getEmail());
        if (c == null) {
            fachada.cadastrarCliente(cliente);
            return new ResponseEntity<>(cliente, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.CONFLICT);
    }

    @GetMapping("/login")
    public ResponseEntity<Cliente> efetuarLogin(@RequestBody Cliente cliente) {
        Cliente c = fachada.buscarCredencial(cliente.getEmail());
        if (c == null) {
            return new ResponseEntity<Cliente>(c, HttpStatus.UNAUTHORIZED);
        }
        return c.getSenha().equals(cliente.getSenha()) ?
                new ResponseEntity<>(c, HttpStatus.OK) : new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
    }
}
