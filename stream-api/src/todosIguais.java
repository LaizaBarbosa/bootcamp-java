import java.util.Arrays;
import java.util.List;

public class todosIguais {
    public static void main(String[] args, Integer integer) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean resultado = numeros.stream().allMatch(n -> n.equals(numeros.get(0)));

        System.out.println(resultado);
    }  
}
