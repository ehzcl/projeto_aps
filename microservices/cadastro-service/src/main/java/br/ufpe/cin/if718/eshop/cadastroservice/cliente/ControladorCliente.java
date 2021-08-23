package br.ufpe.cin.if718.eshop.cadastroservice.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ControladorCliente {
    @Autowired
    private CadastroClientes cadastroClientes;

    public ResponseEntity<HttpStatus> cadastrarCliente(Cliente cliente) {
        return cadastroClientes.inserirCliente(cliente);
    }

    public ResponseEntity<HttpStatus> buscarCredencial(String email, String senha) {
        return cadastroClientes.existeCliente(email, senha);
    }
}
