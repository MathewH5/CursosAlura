package br.com.mathew.consumindoApiGravandoaArquivos.desafIoFinalBuscarCep.principal;

import br.com.mathew.consumindoApiGravandoaArquivos.desafIoFinalBuscarCep.model.BuscarCep;
import br.com.mathew.consumindoApiGravandoaArquivos.desafIoFinalBuscarCep.model.Endereco;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        BuscarCep buscarCep = new BuscarCep();
        List<Endereco> enderecos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        String cep ="";
        while (!cep.equalsIgnoreCase("sair")){

            System.out.println("Digite o CEP: (sair para finalizar o programa)");
            cep = leia.nextLine();

            if (cep.equalsIgnoreCase("sair")){
                break;
            }
            try {
                Endereco endereco = buscarCep.BuscarCep(cep);
                enderecos.add(endereco);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage() + ". Por favor, tente novamente.");
            }
        }

        FileWriter escreverJson = new FileWriter("cep.json");
        escreverJson.write(gson.toJson(enderecos));
        escreverJson.close();

        System.out.println("Enderecos econtrados: " + enderecos);


    }
}
