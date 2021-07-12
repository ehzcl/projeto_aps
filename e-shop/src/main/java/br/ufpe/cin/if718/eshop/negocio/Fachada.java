package br.ufpe.cin.if718.eshop.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Fachada {
    @Autowired
    private ControladorCliente controladorCliente;

    public void cadastrarCliente(Cliente cliente) {
        controladorCliente.cadastrarCliente(cliente);
    }

    public Cliente buscarCredencial(String email) {
        return controladorCliente.buscarCredencial(email);
    }

    public List<Cliente> listarTodosClientes() {
        return controladorCliente.listarTodosClientes();
    }
}
