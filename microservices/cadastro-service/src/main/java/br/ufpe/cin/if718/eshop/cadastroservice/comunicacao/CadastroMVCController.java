package br.ufpe.cin.if718.eshop.cadastroservice.comunicacao;

import br.ufpe.cin.if718.eshop.cadastroservice.cliente.Cliente;
import br.ufpe.cin.if718.eshop.cadastroservice.cliente.ControladorCliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CadastroMVCController {
    @Autowired
    private ControladorCliente controladorCliente;
    
    @PostMapping("/signup")
    public ResponseEntity cadastrarCliente(@RequestBody Cliente cliente) {
        log.info("cadastrarCliente dentro de CadastroMVCController");
        return controladorCliente.cadastrarCliente(cliente);
    }
}
