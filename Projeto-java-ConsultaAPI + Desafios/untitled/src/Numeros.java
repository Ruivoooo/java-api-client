import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int numeroUm = 0;
        int negativo = 0;
        int positivo = 0;
        int numeroDois = 0;

        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número: ");
            numeroUm = scanner.nextInt();
            System.out.println("Digite outro número");
            numeroDois = scanner.nextInt();

            if (numeroUm == numeroDois){
                System.out.println("Os números são iguais");
            }else if (numeroUm > numeroDois){
                System.out.println("Numero 1 é maior que o 2");
            } if (numeroDois>numeroUm) {
            System.out.println("Numero 2 é maior que o 1");
        }
      }
    }


