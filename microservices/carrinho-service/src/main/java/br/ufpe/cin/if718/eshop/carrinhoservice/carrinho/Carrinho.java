package br.ufpe.cin.if718.eshop.carrinhoservice.carrinho;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Carrinho {
    @Id
    private Long idCarrinho;
    private Double valorTotal;
}
