package br.ufpe.cin.if718.eshop.cadastroservice.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CadastroClientes {
    @Autowired
    private IRepositorioClientes repositorioClientes;

    public ResponseEntity<HttpStatus> inserirCliente(Cliente cliente) {
        Cliente temp = repositorioClientes.existeCliente(cliente.getEmail());
        if (temp != null) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        repositorioClientes.inserirCliente(cliente);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<HttpStatus> existeCliente(String email, String senha) {
        Cliente temp = repositorioClientes.existeCliente(email);
        if (temp == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        return temp.getSenha().equals(senha) ? new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
