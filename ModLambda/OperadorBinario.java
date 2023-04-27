package ModLambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        //recebe 2 operadores de um mesmo tipo e resulta em valor do mesmo tipo 
        BinaryOperator<Double> media = 
            (n1, n2) -> (n1 + n2) / 2;
            //o tipo pode ser definido na sentenca mas ele ja esta implicito
        System.out.println(media.apply(8.6, 9.5));

        // pode receber operadores de tipos diferentes
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2; 
            return notaFinal >= 7 ? "Aprovado" : "Reprovado;";
        };

        System.out.println(resultado.apply(9.9, 6.7));

        Function<Double, String> conceito = //se compoe sendo uma funcao menor que a acima
            m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(9.7, 5.1));
    }
}