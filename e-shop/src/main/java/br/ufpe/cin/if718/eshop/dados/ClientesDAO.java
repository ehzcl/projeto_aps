package br.ufpe.cin.if718.eshop.dados;

import br.ufpe.cin.if718.eshop.negocio.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesDAO extends JpaRepository<Cliente, Long> {
    Cliente findClienteByEmail(String email);
}
