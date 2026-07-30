package br.com.alura.consultaCripto.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class consultaPrincipal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da cripto: ");
        String cripto = sc.nextLine();
        String chave = "CG-mCdeiV482PoryzQPUkM4babA";

        String endereco = "https://api.coingecko.com/api/v3/simple" +
                "/price?vs_currencies=usd&ids=" + cripto + "&x_cg_demo_api_key=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
