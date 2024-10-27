package br.com.mathew.javaCollections.oPoderDosSets;

import br.com.mathew.javaCollections.ListaEObjeto.Aula;
import br.com.mathew.javaCollections.RelacionamentoComColecoes.Curso;

public class TestaComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando colecoes do java",",Mathew");

        javaColecoes.adicionaAula(new Aula("Listas de objetos", 19));
        javaColecoes.adicionaAula(new Aula("JAVA", 2));
        javaColecoes.adicionaAula(new Aula("Revisando as ArrayLists", 39));

        Aluno a1 = new Aluno("Rodrigo faria", 3241);
        Aluno a2 = new Aluno("lucas silva", 5482);
        Aluno a3 = new Aluno("joao vinicius", 1526);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("todos os alunos matriculados:");
        javaColecoes.getAlunos().forEach(a ->{
            System.out.println(a);
        });

    }
}