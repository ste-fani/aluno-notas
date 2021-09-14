package com.stefani.homework.class27;

public class Aluno {

    private String nomeAluno;
    private String matricula;
    private String curso;
    private String [] nomeDisciplinas;
    private double [][] notasDisciplinas;

    public Aluno() {
        nomeDisciplinas = new String[3];
        notasDisciplinas = new double[3][4];
    }

    public Aluno(String nomeAluno, String matricula, String curso) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.curso = curso;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void exibirInfos() {
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

    public boolean exibirAprovacao(int indice) {
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

    public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }

    public void setNomePosIJ(int posI, int posJ, double nota) {
        this.notasDisciplinas[posI][posJ] = nota;
    }
}
