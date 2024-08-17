import java.util.Arrays;
import java.util.List;

public class mediaMaiorQue5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> maior5 = numeros
        .stream()
        .filter(n -> n > 5)
        .toList(); //collector

        System.out.println(
            maior5
            .stream()
            .reduce(0, (n1, n2) -> (n1 + n2)) / maior5.size()
        );
    }
}
