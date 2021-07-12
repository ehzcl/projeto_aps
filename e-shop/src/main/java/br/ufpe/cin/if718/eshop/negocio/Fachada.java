package br.ufpe.cin.if718.eshop.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fachada {
    @Autowired
    private ControladorCliente controladorCliente;

    public void cadastrarCliente(Cliente cliente) {
        controladorCliente.cadastrarCliente(cliente);
    }

    public void efetuarLogin(String email, String senha) {
        controladorCliente.efetuarLogin(email, senha);
    }

    public Iterable<Cliente> todosClientes() {
        return controladorCliente.getAll();
    }
}
