package br.ufpe.cin.if718.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fachada {
    @Autowired
    private ControladorCliente controladorCliente;

    public void cadastrarCliente(Cliente cliente) {
        controladorCliente.cadastrarCliente(cliente);
    }
}
