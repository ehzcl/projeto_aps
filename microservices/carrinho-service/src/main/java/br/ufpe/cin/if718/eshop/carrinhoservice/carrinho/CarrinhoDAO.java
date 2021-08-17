package br.ufpe.cin.if718.eshop.carrinhoservice.carrinho;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoDAO extends JpaRepository<Carrinho, Long> {
}
