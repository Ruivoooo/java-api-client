import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhação {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int min = 0 ;
        int max = 100;
        int int_random = (int)(Math.random() * (max - min + 1) + min);
        int tentativas = 0;

        System.out.println(" Jogo de adivinhação Inteiro aleatório entre " + min + " e " + max );
        System.out.println(" Você terá 5 tentativas para conseguir acertar ");
        System.out.println("Qual o numero secreto " + int_random);


        for (int i = 0; i < 5 ; i++) {
            System.out.println("Tentativas para acertar começa agora , digite o número: ");
            tentativas = scanner.nextInt();
            if (int_random == tentativas) {
                System.out.println("Parabéns você acertou o número secreto");
                break;
            }


        }
    }
}
