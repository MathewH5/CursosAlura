package br.com.mathew.listasEColecoesDeDados.desafio1.model;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
       return "o nome: "+ this.getNome() + " idade: " + this.getIdade();
    }
}
