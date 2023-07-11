package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> sum = (ac, n) -> ac + n; //acumulador / valor

        Integer total1 = nums.stream().reduce(sum).get(); //get reune o valor de toda soma acumulada
        //integer = seguranca pra nao dar except
        System.out.println(total1);
        //reduce funciona como: 1+2 = 3+3 = 6 +4 = 10....

        Integer total2 = nums.parallelStream().reduce(100, sum); //ao passar um valor inteiro nao necessita do .get
        //no parallelStream o valor(!=0/ex:100) adicionado se soma a cada um dos numeros da variavel inicial
        
        System.out.println(total2);

        nums.stream()
        .filter(n -> n > 5) //filtro dos elementos
        .reduce(sum) //soma;uniao dos elementos
        .ifPresent(System.out::println); //se presente, imprimir o resultado dos elementos

        

    }
}
