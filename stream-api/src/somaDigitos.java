import java.util.Arrays;
import java.util.List;

public class somaDigitos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        List<Integer> digitos = numeros.stream()
        .flatMap(n -> Arrays.stream(n.toString().split("")))
        .map(Integer::parseInt)
        .toList();

        System.out.println(digitos);

        int resultado = digitos.stream().reduce(0, Integer::sum);
        System.out.println("soma dos digitos: " + resultado);
    }
}
