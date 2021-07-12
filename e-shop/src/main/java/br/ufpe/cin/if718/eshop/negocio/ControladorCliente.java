package br.ufpe.cin.if718.eshop.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControladorCliente {

    @Autowired
    private CadastroClientes cadastroClientes;

    public void cadastrarCliente(Cliente cliente) {
        cadastroClientes.inserirCliente(cliente);
    }

    public void efetuarLogin(String email, String senha) {
        cadastroClientes.existeCliente(email, senha);
    }

    public Iterable<Cliente> getAll() {
        return cadastroClientes.getAll();
    }
}
