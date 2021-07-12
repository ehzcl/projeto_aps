package br.ufpe.cin.if718.eshop.negocio;

import br.ufpe.cin.if718.eshop.dados.IRepositorioClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CadastroClientes {

    @Autowired
    private IRepositorioClientes repositorioClientes;

    public void inserirCliente(Cliente cliente) {
        repositorioClientes.inserirCliente(cliente);
    }

    public Cliente existeCliente(String email) {
        return repositorioClientes.existeCliente(email);
    }

    public List<Cliente> listarTodosClientes() {
        return repositorioClientes.listarTodosClientes();
    }
}
