package br.ufpe.cin.if718.eshop.dados;

import br.ufpe.cin.if718.eshop.negocio.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesDAO extends CrudRepository<Cliente, Long> { }
