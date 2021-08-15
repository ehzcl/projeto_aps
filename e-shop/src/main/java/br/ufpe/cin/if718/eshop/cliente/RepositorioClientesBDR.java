package br.ufpe.cin.if718.eshop.cliente;

import br.ufpe.cin.if718.eshop.cliente.Cliente;
import br.ufpe.cin.if718.eshop.cliente.ClientesDAO;
import br.ufpe.cin.if718.eshop.cliente.IRepositorioClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RepositorioClientesBDR implements IRepositorioClientes {
    @Autowired
    private ClientesDAO repositorioClientes;

    @Override
    public void inserirCliente(Cliente cliente) {
        repositorioClientes.save(cliente);
    }

    @Override
    public Cliente existeCliente(String email) {
        return repositorioClientes.findClienteByEmail(email);
    }
}
