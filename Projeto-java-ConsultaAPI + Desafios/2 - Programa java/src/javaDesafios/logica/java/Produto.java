package javaDesafios.logica.java;

import java.util.Scanner;


public class Produto {

    Scanner scanner = new Scanner(System.in);

    private String nome;
    private double preco;
    private double produto;
    private double percentual;
    private double aplicar;
    private double desconto;

    double getPreco() {
        return preco;
    }

    public void setPreco(double preco){
       this.preco = preco;
    }

    String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void aplicarDesconto (){
    System.out.println("Digite o preço do produto:\n");
    produto = scanner.nextInt();
    System.out.println("Qual o valor do desconto:\n");
    percentual = scanner.nextInt();
    aplicar  = (percentual / 100) * produto;
    desconto = produto - aplicar;
    System.out.println("Digite o valor do produto com desconto:\n" + aplicar );
    }
}
