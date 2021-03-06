package br.ufpe.cin.if718.eshop.subsistemacomunicacaolistaprodutos;

import br.ufpe.cin.if718.eshop.negocio.Fachada;
import br.ufpe.cin.if718.eshop.produto.Produto;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("/produtos")
public class FachadaComunicacaoListaProdutos {
    private final String urlAPI = "https://fakestoreapi.com/products?limit=9";
    private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    @GetMapping("")
    public Produto[] listarProdutos() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(urlAPI))
                .build();

      HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

      Gson gson = new Gson();
      return gson.fromJson(response.body(), Produto[].class);
    }
}
