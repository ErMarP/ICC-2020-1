package practica15;

import java.util.List;
import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("Prueba de orden:");
        List<String> cadenas = Arrays.asList("a","abc","","ab");
        Interface.orden(cadenas).forEach(System.out::println);
       
        System.out.println("Prueba de nombre en español:");
        List<Integer> numeros = Arrays.asList(-6, -9, 0, 1, 3, 5, 9, 14, 36);
        Interface.nombreEsp(numeros).forEach(System.out::println);
       
        System.out.println("Prueba de infinito:");
        Interface.infinito("s").limit(15).forEach(System.out::println);
    }
}