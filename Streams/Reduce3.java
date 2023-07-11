package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        
        AlunoF a1 = new AlunoF("Ana", 7.1);
        AlunoF a2 = new AlunoF("Luna", 6.1);
        AlunoF a3 = new AlunoF("Gui", 8.1);
        AlunoF a4 = new AlunoF("Gabi", 10);

        List<AlunoF> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<AlunoF> aprovado = a -> a.nota >= 7;
        Function<AlunoF, Double> apenasNota = a -> a.nota;

        BiFunction<Media, Double, Media> calcularMedia =
                //acum. ; tipo de valor ; media
            (media, nota) -> media.adicionar(nota); //a media ja e retornada
        
        BinaryOperator<Media> combinarMedia = 
            (m1, m2) -> Media.combinar(m1, m2);
        
        Media media = alunos.stream()
            .filter(aprovado)
            .map(apenasNota)
            .reduce(new Media(), calcularMedia, combinarMedia);
            //logica para pegar, calcular e combinar as medias gerais

        System.out.println("A media geral e: " + media.getValor());
    }
}
