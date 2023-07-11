package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
     
        AlunoF a1 = new AlunoF("Ana", 7.1);
        AlunoF a2 = new AlunoF("Luna", 6.1);
        AlunoF a3 = new AlunoF("Gui", 8.1);
        AlunoF a4 = new AlunoF("Gabi", 10);

        List<AlunoF> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<AlunoF> aprovado = a -> a.nota >= 7;
        Function<AlunoF, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        alunos.parallelStream() //pode ser usado stream() tambem, mais simples mas menos seguro
            .filter(aprovado)
            .map(apenasNota)
            .reduce(somatorio)
            .ifPresent(System.out::println);
    }
}
