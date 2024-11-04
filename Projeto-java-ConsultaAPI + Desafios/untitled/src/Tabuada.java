import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int total = 0;

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();


        for (int i = 0; i < 10; i++) {
           total = numero * i;
            System.out.println( numero + "x" + i + "=" + total);

            
        }
    }
}
