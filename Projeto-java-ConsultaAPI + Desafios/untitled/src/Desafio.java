import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldoInicial = 2500;
        int cliente = 0;
        int receber = 0;
        int receberTotal = 0;
        int transferir = 0;
        int transferirTotal = 0;
        int opcoes = 0;

        System.out.println("***************************************");
        System.out.println("Dados iniciais do cliente:");

        System.out.println("Nome:             Carlos Eduardo");
        System.out.println("Tipo conta:       Corrente");
        System.out.println("Saldo inicial:    R$ 2500,00    ");
        System.out.println("***************************************\n");

        String menu = """
                \n****Opções****
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;
        System.out.println(menu);

        while (opcoes != 4) {
            opcoes = scanner.nextInt();
            if (opcoes == 1) {
                System.out.println("Seu saldo é de R$: " + saldoInicial);
                System.out.println(menu);
            }
            if (opcoes == 2) {
                System.out.println("Qual o valor que você quer transferir: ");
                transferir = scanner.nextInt();
                if (saldoInicial > transferir) {
                    System.out.println("O valor transferido foi de: R$ " + transferir);
                    saldoInicial -= transferir;
                    System.out.println("\nSeu saldo agora é de R$" + saldoInicial);
                    System.out.println(menu);

                } else if (transferir > saldoInicial) {
                    System.out.println("Essa transferencia não é possivel");
                    System.out.println(menu);
                    opcoes = scanner.nextInt();
                }
                } if (opcoes == 3) {
                    System.out.println("Qual valor você recebeu: ");
                    receber = scanner.nextInt();
                    System.out.println("O valor recebido foi de R$ " + receber);
                    saldoInicial += receber;
                    System.out.println("Seu saldo agora é de R$ " + saldoInicial);
                 }

        }

    }
}






