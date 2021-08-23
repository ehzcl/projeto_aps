package br.ufpe.cin.if718.eshop.cadastroservice.comunicacao;

import java.net.http.HttpClient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.if718.eshop.cadastroservice.cliente.Cliente;
import br.ufpe.cin.if718.eshop.cadastroservice.cliente.ControladorCliente;

@RestController
@Slf4j
public class CadastroMVCController {
    @Autowired
    private ControladorCliente controladorCliente;
    private final HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/signup")
    public ResponseEntity<HttpStatus> cadastrarCliente(@RequestBody Cliente cliente) {
        log.info("cadastrarCliente dentro de CadastroMVCController");
        return controladorCliente.cadastrarCliente(cliente);
    }
}
