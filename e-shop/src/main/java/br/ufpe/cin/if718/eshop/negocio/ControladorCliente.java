package br.ufpe.cin.if718.eshop.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ControladorCliente {

    @Autowired
    private CadastroClientes cadastroClientes;

    public void cadastrarCliente(Cliente cliente) {
        cadastroClientes.inserirCliente(cliente);
    }

    public Cliente buscarCredencial(String email) {
        return cadastroClientes.existeCliente(email);
    }

    public List<Cliente> listarTodosClientes() {
        return cadastroClientes.listarTodosClientes();
    }
}
