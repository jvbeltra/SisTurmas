/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.sisturmas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 18202525
 */
public class Controle {

    private Scanner teclado;
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;

    public Controle() {
        teclado = new Scanner(System.in);
        turmas = new ArrayList<>();
        alunos = new ArrayList<>();
    }

    public void inicia() {
        int opcao;

        do {
            System.out.println("----------- EAE VI BOM DIA ---toca um somebodyonce-----");
            System.out.println("Opcoes:");
            System.out.println("1 - Incluir turmas:");
            System.out.println("2 - Incluir Alunos:");
            System.out.println("3 - Listar Turmas:");
            System.out.println("4 - Listar Alunos:");
            System.out.println("5 - Matricular na turma:");
            System.out.println("6 - Listar turmas de aluno");
            System.out.println("7 - Listar alunos de turma");

            System.out.println("0 - Ir embora");
            System.out.println("-------------DAB-------------------");

            System.out.println("opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1: {
                    incluiTurma();
                    break;
                }
                case 2: {
                    incluiAluno();
                    break;
                }
                case 3: {
                    listarTurma();
                    break;
                }
                case 4: {
                    listarAlunos();
                    break;
                }
                case 5: {
                    matricularAlunoEmTurma();
                }
                case 6: {
                    listarTurmasDeAluno();
                }
            }
        } while (opcao != 0);

    }

    private void incluiTurma() {
        System.out.println("---------- INSERINDO TURMA---------");
        System.out.println("Codigo:");
        String codigoTurma = teclado.nextLine();
        Turma turma = new Turma(codigoTurma);
        turmas.add(turma);
    }

    private void incluiAluno() {
        System.out.println("---------INSERINDO ALUNO---------");
        System.out.println("Matricula:");
        String matriculaAluno = teclado.nextLine();
        Aluno aluno = new Aluno(matriculaAluno);
        alunos.add(aluno);
    }

    private void listarTurma() {
        System.out.println("--------- LISTANDO TURMA -------");
        for (Turma turma : turmas) {
            System.out.println("Turma:" + turma.getCodigo());
        }
    }

    private void listarAlunos() {
        System.out.println("--------- LISTANDO ALUNOS -------");
        for (Aluno aluno : alunos) {
            System.out.println("Aluno" + aluno.getMatricula());
        }
    }

    private void matricularAlunoEmTurma() {
        System.out.println("----MATRICULANDO ALUNO----");
        System.out.println("Insira a matrícula do aluno: ");
        String alunoMatr = teclado.next();
        System.out.println("Insira o código da turma: ");
        String turmaCod = teclado.next();
        try {
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula().equals(alunoMatr)) {
                    for (Turma turma : turmas) {
                        if (turma.getCodigo().equals(turmaCod)) {
                            aluno.addTurma(turma);
                            turma.addAluno(aluno);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void listarTurmasDeAluno() {

    }

}
