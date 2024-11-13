import java.util.Scanner;
public class ProjetoBanco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nameClient = "";
        String accountType = "";
        double openingBalance = 0;
        double receiveValue = 0;
        double transferValue = 0;
        int option = 0;
        String choseOptions = """
                1 - Consultar saldos
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;


        System.out.println("BANCO ITAÚ");
        System.out.println("INFORME SEU NOME: ");
        nameClient = leitura.next();
        System.out.println("INFORME O TIPO DA CONTA: (CORRENTE|POUPANÇA)");
        accountType = leitura.next();
        System.out.println("INFORME O SALDO INICIAL (R$): ");
        openingBalance = leitura.nextDouble();

        System.out.println("******************************************");
        System.out.println("Dados iniciais do cliente");
        System.out.println("Nome do Cliente       : " + nameClient);
        System.out.println("Tipo de Conta         : " + accountType);
        System.out.println("Saldo Inicial         : R$ " + openingBalance);
        System.out.println("******************************************");

        while (option != 4) {
            System.out.println(choseOptions);
            option = leitura.nextInt();

            if (option == 1) {
                System.out.println("O saldo atualizado é: " + openingBalance);
            } else if (option == 2) {
                System.out.println("Qual o valor deseja transferir: ");
                transferValue = leitura.nextDouble();
                if (transferValue > openingBalance) {
                    System.out.println("Não há saldo suficiente para realizar a transferência");
                } else {
                    openingBalance -= transferValue;
                    System.out.println("Novo saldo é: " + openingBalance);
                }
            } else if (option == 3) {
                System.out.println("Valor recebido: ");
                receiveValue = leitura.nextDouble();
                openingBalance += receiveValue;
                System.out.println("Novo saldo: " + openingBalance);
            } else if (option != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}

