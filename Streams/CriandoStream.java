package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {
        
        Consumer<String> print = System.out::print; // referencia o metodo print a uma Str
        Consumer<Integer> println = System.out::println; // referencia o metodo print a uma Str

        Stream<String> langs = Stream.of("Java ", "Ruby ", "Lua\n");
        langs.forEach(print);

        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Dart\n"};
        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print); //utilizando diretamente o metodo Arrays
        Arrays.stream(maisLangs, 1, 3).forEach(print); //seta o indice do array a ser mostrado 
        
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print); //nao e processado em ordem

        //Stream.generate(() -> "a").forEach(print); // imprime um resultado infinitamente(gerar)
        Stream.iterate(0, n -> n + 1).forEach(println); // gera um stream progressivo infinitamente 
    }
}
