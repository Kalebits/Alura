package br.com.alura.consultaReceitas.principal;

import br.com.alura.consultaReceitas.modelos.ReceitaDB;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaPrincipal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o nome da receita: ");
        String nomeReceita = sc.nextLine();

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + nomeReceita;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        Gson gson = new Gson();
        ReceitaDB[] receitas[] =  gson.
        System.out.println(receitas);

    }
}
