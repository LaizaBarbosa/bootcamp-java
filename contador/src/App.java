import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os números para contagem: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        
        try {
            contar(n1, n2);
            
        }catch(paramInvalidoException e){
            System.out.println(e);
            
        }
        
        scan.close();

    }

    static void contar(int num1, int num2) throws paramInvalidoException {
        if(num1 < num2) {
            int cont = num2 - num1;

            for (int i = 1; i <= cont; i++) {
                System.out.printf("imprimindo número %d \n", i);
            }

        }

        throw new paramInvalidoException("O segundo número deve ser maior que o primeiro");
    }
}
