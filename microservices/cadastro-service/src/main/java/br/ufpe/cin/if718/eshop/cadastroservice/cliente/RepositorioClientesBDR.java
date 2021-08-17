package br.ufpe.cin.if718.eshop.cadastroservice.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositorioClientesBDR implements IRepositorioClientes {
    @Autowired
    private ClienteDAO repositorioClientes;

    @Override
    public void inserirCliente(Cliente cliente) {
        repositorioClientes.save(cliente);
    }

    @Override
    public Cliente existeCliente(String email) {
        return repositorioClientes.findClienteByEmail(email);
    }
}
