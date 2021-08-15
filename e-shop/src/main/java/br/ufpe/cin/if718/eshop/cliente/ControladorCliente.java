package br.ufpe.cin.if718.eshop.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ControladorCliente {
    @Autowired
    private CadastroClientes cadastroClientes;

    public ResponseEntity cadastrarCliente(Cliente cliente) {
        return cadastroClientes.inserirCliente(cliente);
    }

    public ResponseEntity buscarCredencial(String email, String senha) {
        return cadastroClientes.existeCliente(email, senha);
    }
}
