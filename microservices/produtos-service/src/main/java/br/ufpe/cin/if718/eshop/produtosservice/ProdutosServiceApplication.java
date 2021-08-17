package br.ufpe.cin.if718.eshop.produtosservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProdutosServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutosServiceApplication.class, args);
	}

}
