package br.com.mathew.javaCollections.oPoderDosSets;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<String>();

        alunos.add("Catriel magadi");
        alunos.add("Mathew Hanna");
        alunos.add("Michael Brown");
        alunos.add("rafa lucas");
        alunos.add("Samuel Martin");
        alunos.add("Samuel Martin");
        System.out.println(alunos);
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        boolean pauloExiste = alunos.contains("Paulo");
        System.out.println(pauloExiste);
        alunos.remove("rafa lucas");

        System.out.println(alunos.size());

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

    }
}
