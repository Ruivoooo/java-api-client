import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int calcularQuadrado = 0;
        int calcularArea = 0;
        int escolha = 0 ;
        int numeroEscolhido = 0;


        System.out.println("--------------------------------");
        System.out.println("1- Calcular a área do quadrado: ");
        System.out.println("2- Calcular a área do círculo:  ");
        System.out.println("--------------------------------");

        System.out.println("Qual das duas opções você deseja?:");
        escolha = scanner.nextInt();


        if(escolha == 1){
            System.out.println("Digte o número: ");
            numeroEscolhido = scanner.nextInt();
            calcularQuadrado = numeroEscolhido * 4;
            System.out.println("A área do circulo é: " + calcularQuadrado);
        }
        }


    }
