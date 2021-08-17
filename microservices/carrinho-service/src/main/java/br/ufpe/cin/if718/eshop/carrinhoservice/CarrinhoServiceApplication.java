package br.ufpe.cin.if718.eshop.carrinhoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CarrinhoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrinhoServiceApplication.class, args);
	}

}
