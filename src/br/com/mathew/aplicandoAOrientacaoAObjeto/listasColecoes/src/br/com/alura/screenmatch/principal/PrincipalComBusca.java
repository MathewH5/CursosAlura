package br.com.mathew.aplicandoAOrientacaoAObjeto.listasColecoes.src.br.com.alura.screenmatch.principal;

import br.com.mathew.aplicandoAOrientacaoAObjeto.listasColecoes.src.br.com.alura.screenmatch.modelos.Titulo;
import br.com.mathew.aplicandoAOrientacaoAObjeto.listasColecoes.src.br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o filme para a busca: ");
        var busca = leia.nextLine();
        busca = busca.replace(" ", "+");
        String enderecoBusca = "http://www.omdbapi.com/?t=" + busca + "&apikey=c142b0d2";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(enderecoBusca))
                .build();
        HttpResponse<String> respose = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(respose.body());

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        TituloOmdb meuTituloOmdb = gson.fromJson(respose.body(), TituloOmdb.class);
        System.out.println(meuTituloOmdb);

        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println(meuTitulo);

    }
}
