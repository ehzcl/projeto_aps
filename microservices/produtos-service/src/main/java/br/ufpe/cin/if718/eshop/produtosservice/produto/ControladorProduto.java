package br.ufpe.cin.if718.eshop.produtosservice.produto;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class ControladorProduto {
    private final HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

    public Produto[] listarProdutos() throws IOException, InterruptedException {
        String urlAPI = "https://fakestoreapi.com/products?limit=9";
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(urlAPI))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        return gson.fromJson(response.body(), Produto[].class);
    }
}
