package br.ufpe.cin.if718.eshop.cliente;

import br.ufpe.cin.if718.eshop.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesDAO extends JpaRepository<Cliente, Long> {
    Cliente findClienteByEmail(String email);
}
