package br.ufpe.cin.if718.eshop.negocio;

import br.ufpe.cin.if718.eshop.cliente.Cliente;
import br.ufpe.cin.if718.eshop.cliente.ControladorCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class Fachada {
    @Autowired
    private ControladorCliente controladorCliente;

    private static Fachada instanciaUnica;

    private Fachada() {}

    public ResponseEntity cadastrarCliente(Cliente cliente) {
        return controladorCliente.cadastrarCliente(cliente);
    }

    public ResponseEntity buscarCredencial(String email, String senha) {
        return controladorCliente.buscarCredencial(email, senha);
    }

    public static Fachada getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new Fachada();
        }
        return instanciaUnica;
    }
}
