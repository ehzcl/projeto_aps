package br.ufpe.cin.if718.eshop.produtosservice.produto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {
    private Long id;
    private String title;
    private Double price;
    private String image;
}
