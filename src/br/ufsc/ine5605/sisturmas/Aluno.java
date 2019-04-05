/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.sisturmas;

import java.util.ArrayList;

/**
 *
 * @author 18202525
 */
public class Aluno {
    private String matricula;
    private ArrayList<Turma> turmas;
    
    Aluno(String matriculaAluno) {
        this.matricula = matriculaAluno;
        this.turmas = new ArrayList<>();
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void addTurma(Turma turma){
        
    }
    public void delTurma(Turma turma){
        
    }
    
    public ArrayList<Turma> getTurmas(){
        for (Turma turma : turmas) {
            System.out.println("Turma: " + turma.getCodigo());
        }
        return this.turmas;
    }
}
