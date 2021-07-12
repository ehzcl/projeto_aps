package br.ufpe.cin.if718.dados;

import br.ufpe.cin.if718.negocio.Cliente;
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
        return null;
    }

    @Override
    public void adicionarFavorito(Long idCliente, Long idProduto) {

    }
}
