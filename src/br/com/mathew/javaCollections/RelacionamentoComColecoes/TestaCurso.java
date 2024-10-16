package br.com.mathew.javaCollections.RelacionamentoComColecoes;

import br.com.mathew.javaCollections.ListaEObjeto.Aula;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominiando as colecoes do java", "Paulo Silveira");

//        List<Aula> aulas = javaColecoes.getAulas();
//        System.out.println(aulas);

//        Aula a2 = new Aula("Listas de objetos", 19);
//        aulas.add(new Aula("Revisando as ArrayLists", 20));
//        aulas.add(a2);

//        nao funciona devido a get aula ser apenas de leitura feito com Collections.unmodifiableList(aulas);
//        javaColecoes.getAulas().add(new Aula("ta",21));
        javaColecoes.adicionaAula(new Aula("Listas de objetos", 19));
        javaColecoes.adicionaAula(new Aula("JAVA", 2));
        javaColecoes.adicionaAula(new Aula("Revisando as ArrayLists", 39));

        System.out.println(javaColecoes.getAulas());
        System.out.println(javaColecoes);
    }
}
