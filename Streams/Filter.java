package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        
        AlunoF a1 = new AlunoF ("Ana", 7.8);
        AlunoF a2 = new AlunoF ("Bia", 5.8);
        AlunoF a3 = new AlunoF ("Dan", 9.8);
        AlunoF a4 = new AlunoF ("Gui", 6.8);
        AlunoF a5 = new AlunoF ("Rebeca", 7.1);
        AlunoF a6 = new AlunoF ("Pedro", 8.8);

        List<AlunoF> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<AlunoF> aprovado = a -> a.nota >= 7; //age como for;if
        Function<AlunoF, String> msgAprovado = 
        a -> "Parabens " + a.nome + " Voce passou!";

        alunos.stream()
            .filter(aprovado) //necessita de um predicado(lambda para testar o valor)
            .map(msgAprovado) //pode usar uma function para imprimir a msg com o valor do filter
            .forEach(System.out::println);
    }   
}
