import java.util.Arrays;
import java.util.List;


public class segundoMaior {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
        int maiorN = numeros.stream().max(Integer::compare).orElseThrow();

        int segundoMaior = numeros.stream().filter(n -> n < maiorN).max(Integer::compare).orElseThrow();

        System.out.println(segundoMaior);
    }
}
