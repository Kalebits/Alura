package br.com.alura.googleBooks.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class searchBooks {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        String livro = sc.nextLine();

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" +
                livro.replace(" ", "") +
                "&key=AIzaSyARtiaDrwfFJ4A0iRz5sBseaysxDJ0WK_E";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        // Por enquanto sem biblioteca para tratar JSON
    }
}
