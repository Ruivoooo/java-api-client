package javaDesafios.logica.TryCatchDesafios;

import java.util.Scanner;

public class DivisaoPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        int n1;
        int n2;
        int resultado;

        System.out.println("Digite o numero que ira dividir: ");
        n1 = scanner.nextInt();

        System.out.println("Digite o numero que sera dividido: ");
        n2 = scanner.nextInt();

        resultado = n1 / n2;


            System.out.println("O resultado da divisão foi de: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Não é possivel dividir por zero");
        }
    }
}

