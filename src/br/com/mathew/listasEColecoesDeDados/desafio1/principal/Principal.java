package br.com.mathew.listasEColecoesDeDados.desafio1.principal;

import br.com.mathew.listasEColecoesDeDados.desafio1.model.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa =new Pessoa();
        Pessoa pessoa2 =new Pessoa();
        Pessoa pessoa3 =new Pessoa();

        pessoa.setNome("Mathew");
        pessoa.setIdade(12);

        pessoa2.setNome("lucas");
        pessoa2.setIdade(16);

        pessoa3.setNome("NEy");
        pessoa3.setIdade(21);

        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa2);

        System.out.println("o tamanho da lista é de " + listaDePessoas.size());
        System.out.println("o primerio da lista é o " + listaDePessoas.get(0));
        System.out.println("a lista completa " + listaDePessoas);


    }
}
