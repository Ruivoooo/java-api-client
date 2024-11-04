package javaDesafios.logica.TryCatchDesafios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GitHubDesafio {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String usuario;

        System.out.println("Digite o nome do usuario: ");
        usuario = scanner.nextLine();

        String endereco = "https://api.github.com/users/" + usuario;

        try {
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create(endereco)).header("Accept", "application/vnd.github.v3+json").build();
            HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());

        } catch (IllegalArgumentException e) {
            System.out.println("Nao deu certo");
        }

    }

}
