package br.com.mathew.consumindoApiGravandoaArquivos.desafIoFinalBuscarCep.model;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarCep {
    public Endereco BuscarCep(String cep) {
        URI endereco = URI.create("https://viacep.com.br/ws/"+ cep +"/json/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        HttpResponse<String> response;

        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

        }catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao buscar cep", e);
        }catch (IllegalStateException e) {
            throw new RuntimeException("cep incorreto");
        }

        String resposta = response.body();

        return new Gson().fromJson(resposta, Endereco.class);
    }
}
