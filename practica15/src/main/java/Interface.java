import java.util.stream.Stream;
import java.util.function.Supplier;
import java.util.List;

public class Interface {
    
    /**
     * Metodo que ordena una lista de cadenas de la mas larga a la mas corta
     * @param List<String> 
     * @return Stream<Sring> ordenado
     */
    public static Stream<String> orden(List<String> list) {
        return list.stream().sorted((s1, s2) -> {
            return s2.length() -s1.length();
        });
    }

    /**
     * Metodo que convierte unicamente los numeros del 0 al 9 en su representacion a español,descartando los que no estan en el rango
     * @param
     * @return
     */
    public static Stream<String> nombreEsp(Stream<Integer> numeros) {
        String[] nombres = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
        return numeros.filter(n -> n >= 0 && n <= 9).map(n -> nombres[n]);
    }

    /**
     * Metodo que genera un Stream de cadenas infinito, donde el primer elemento es "", el segundo s, el tercero s+s y asi sucesivamente
     * @param S la cadena que se repetira
     * @return Stream<String> donde es una repeticion de s
     */
    public static Stream<String> infinito(String s) {
        return Stream.generate(new Supplier<String>() {
            int i = 0;
            public String get() {
                return s.repeat(i++);
            }
        });
    }
}