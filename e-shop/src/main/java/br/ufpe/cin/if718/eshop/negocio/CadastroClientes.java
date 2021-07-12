package br.ufpe.cin.if718.negocio;

import br.ufpe.cin.if718.dados.IRepositorioClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastroClientes {

    @Autowired
    private IRepositorioClientes repositorioClientes;

    public void inserirCliente(Cliente cliente) {
        repositorioClientes.inserirCliente(cliente);
    }
}
