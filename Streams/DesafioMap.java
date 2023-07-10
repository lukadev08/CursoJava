package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        UnaryOperator<String> inverter = 
            s -> new StringBuilder(s).reverse().toString(); //metodo para inverter a ordem do print dos resultados

        Function<String, Integer> binToInt = 
            s -> Integer.parseInt(s, 2); //converte uma string binaria para inteiro

        nums.stream()
            .map(Integer::toBinaryString) //metodo pra converter numeros em binario
            .map(inverter)
            .map(binToInt)
            .forEach(System.out::println);
    }
}
