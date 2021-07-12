package br.ufpe.cin.if718.eshop.dados;

import br.ufpe.cin.if718.eshop.negocio.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositorioClientesBDR implements IRepositorioClientes {

    @Autowired
    private ClientesDAO repositorioClientes;

    @Override
    public void inserirCliente(Cliente cliente) {
        repositorioClientes.save(cliente);
    }

    @Override
    public Cliente existeCliente(String email, String senha) {
        Cliente c = null;
        Iterable<Cliente> it = repositorioClientes.findAll();
        for (Cliente cliente : it) {
            if (cliente.getEmail().equals(email) && cliente.getSenha().equals(senha)) {
                c = cliente;
            }
        }
        return c;
    }

    @Override
    public void adicionarFavorito(Long idCliente, Long idProduto) {

    }

    @Override
    public Iterable<Cliente> getAll() {
        return repositorioClientes.findAll();
    }
}
