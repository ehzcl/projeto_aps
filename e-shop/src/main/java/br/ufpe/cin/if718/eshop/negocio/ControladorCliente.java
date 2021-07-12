package br.ufpe.cin.if718.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControladorCliente {

    @Autowired
    private CadastroClientes cadastroClientes;

    public void cadastrarCliente(Cliente cliente) {
        cadastroClientes.inserirCliente(cliente);
    }
}
