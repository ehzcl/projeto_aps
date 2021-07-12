package br.ufpe.cin.if718.eshop.negocio;

import br.ufpe.cin.if718.eshop.dados.IRepositorioClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastroClientes {

    @Autowired
    private IRepositorioClientes repositorioClientes;

    public void inserirCliente(Cliente cliente) {
        repositorioClientes.inserirCliente(cliente);
    }

    public Cliente existeCliente(String email, String senha) {
        return repositorioClientes.existeCliente(email, senha)
    }

    public Iterable<Cliente> getAll() {
        return repositorioClientes.getAll();
    }
}
