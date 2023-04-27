package ModLambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        
        BinaryOperator<Double> calculo = (x, y) -> {return x + y;}; 
            //especifica uma funcao definindo o tipo da variavel a ser atribuida, parametrando um tipo e recebendo do mesmo tipo   
        System.out.println(calculo.apply(2.0, 4.0));
        
        calculo = (x, y) -> x * y; 
        System.out.println(calculo.apply(2.0, 4.0));
        

        BinaryOperator<Integer> calculo2 = (x, y) -> {return x + y;}; 
                        // o tipo da variavel importa na execucao do metodo
        System.out.println(calculo2.apply(2, 4));
        
        calculo2 = (x, y) -> x * y; 
        System.out.println(calculo2.apply(2, 4));
    }
}
