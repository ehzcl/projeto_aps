package br.ufpe.cin.if718.dados;

import br.ufpe.cin.if718.negocio.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesDAO extends CrudRepository<Cliente, Long> { }
