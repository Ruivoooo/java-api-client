package javaDesafios.logica.java;

import java.util.Scanner;

public class Aluno {
    Scanner scanner = new Scanner(System.in);

    private double nota;
    private String nome;
    private double quantDeNotas;

    double getNota(){
        return nota;
    }
    public void setNota(double nota){
        this.nota = nota;
    }
        String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public void calcularMedia(){
        quantDeNotas = nota;
        double mediaDenotas = (nota / quantDeNotas);
        System.out.println("A media da nota dos alunos é :" + mediaDenotas);


    }



}
