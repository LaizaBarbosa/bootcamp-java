import java.util.Arrays;
import java.util.List;

public class intervalo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
        List<Integer> listaIntervalo =  numeros.stream().skip(4).limit(5).toList();
        
        System.out.println(listaIntervalo);
    }
}
