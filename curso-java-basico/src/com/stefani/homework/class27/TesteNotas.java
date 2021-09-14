package com.stefani.homework.class27;

import java.util.Scanner;

public class TesteNotas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno1 = new Aluno();

        System.out.println("Informe o nome do aluno:");
        aluno1.setNomeAluno(scan.nextLine());

        System.out.println("Informe a matrícula do aluno: " + aluno1.getNomeAluno());
        aluno1.setMatricula(scan.nextLine());

        System.out.println("Informe o curso do aluno: " + aluno1.getNomeAluno());
        aluno1.setCurso(scan.nextLine());

        for (int i = 0; i < aluno1.getNotasDisciplinas().length; i++) {
            System.out.println("Informe o nome da disciplina " + i);
            aluno1.setNomeDisciplinaPos(i, scan.nextLine());
        }

        for (int i = 0; i < aluno1.getNotasDisciplinas().length; i++) {
            System.out.println("Notas da disciplina " + aluno1.getNotasDisciplinas()[i]);
            for (int j = 0; j < aluno1.getNotasDisciplinas()[i].length; j++) {
                System.out.println("Informe a nota " + (j+1));
                aluno1.setNomePosIJ(i, j, scan.nextDouble());
            }
        }

        aluno1.exibirInfos();

        for (int i = 0; i < aluno1.getNomeDisciplinas().length; i++) {
            if (aluno1.exibirAprovacao(i)) {
                System.out.println("Disciplina " + aluno1.getNomeDisciplinas()[i] + " - APROVADO!");
            } else {
                System.out.println("Disciplina " + aluno1.getNomeDisciplinas()[i] + " - REPROVADO!");
            }
        }
    }
}
