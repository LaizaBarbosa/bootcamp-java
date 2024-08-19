import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class maiorNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);
    
        int maiorPrimo = numeros.stream().filter(n -> {
            if(n < 2){
                return false;
            }
            
            for (int i = 2; i < n / 2; i++) {
                if (n  % i == 0) {
                    return false;
                }   
            }
            return true;
        })
        .max(Comparator.naturalOrder()).orElseThrow();
        
        System.out.println(maiorPrimo);
    }
}
