package br.ufpe.cin.if718.eshop.cadastroservice.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends JpaRepository<Cliente, Long> {
    Cliente findClienteByEmail(String email);
}
