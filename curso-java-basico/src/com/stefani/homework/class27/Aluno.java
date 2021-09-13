package com.stefani.homework.class27;

public class Aluno {

    String nomeAluno, matricula, curso;
    String nomeDisciplinas [];
    double notasDisciplinas [][];


    void exibirInfos() {
        System.out.println("Nome Completo: " + nomeAluno +
                "\nMatrícula: " + matricula +
                "\nCurso: " + curso +
                "\nDisciplinas matriculadas: \n" + nomeDisciplinas[0] + "\n" + nomeDisciplinas[1] + "\n" + nomeDisciplinas[2]);

        for (int i = 0; i<notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean exibirAprovacao(int indice) {
        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        if (media >= 7) {
            return true;
        } else {
            return false;
        }

    }
}
