import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        
        try {
            System.out.println("Digite o numero da agência: ");
            String agencia = scanner.next();
            
            System.out.println("Digite o numero da conta: ");
            int numero = scanner.nextInt();
            
            System.out.println("Digite o seu nome: ");
            String nomeCliente = scanner.next();
            
            System.out.println("Digite o saldo inicial: ");
            double saldo = scanner.nextDouble();

            System.out.printf("Bem vindo %S. Aqui estão os dados iniciais da sua conta: \nAgência: %S \nNúmero: %d \nSaldo: %.2f \n", nomeCliente, agencia, numero, saldo);
            
        } catch (Exception e) {
            System.out.println("algo deu errado: " + e);
        }
    }
}
