package com.stefani.homework.class27;

import java.util.Scanner;

public class TesteNotas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno1 = new Aluno();

        aluno1.nomeDisciplinas = new String[3];
        aluno1.notasDisciplinas = new double[3][4];


        System.out.println("Informe o nome do aluno:");
        aluno1.nomeAluno = scan.nextLine();

        System.out.println("Informe a matrícula do aluno: " + aluno1.nomeAluno);
        aluno1.matricula = scan.nextLine();

        System.out.println("Informe o curso do aluno: " + aluno1.nomeAluno);
        aluno1.curso = scan.nextLine();

        for (int i = 0; i < aluno1.notasDisciplinas.length; i++) {
            System.out.println("Informe o nome da disciplina " + i);
            aluno1.nomeDisciplinas[i] = scan.nextLine();
        }

        for (int i = 0; i < aluno1.notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + aluno1.notasDisciplinas[i]);
            for (int j = 0; j < aluno1.notasDisciplinas[i].length; j++) {
                System.out.println("Informe a nota " + (j+1));
                aluno1.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno1.exibirInfos();

        for (int i = 0; i < aluno1.nomeDisciplinas.length; i++) {
            if (aluno1.exibirAprovacao(i)) {
                System.out.println("Disciplina " + aluno1.nomeDisciplinas[i] + " - APROVADO!");
            } else {
                System.out.println("Disciplina " + aluno1.nomeDisciplinas[i] + " - REPROVADO!");
            }
        }
    }
}
