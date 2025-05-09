package br.com.mathew.javaCollections.ListaEObjeto;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class TestandoListaDeAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 19);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 23);

        ArrayList<Aula> aulas = new ArrayList<Aula>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);
    }
}
