package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//verifica a compatibilidade, existencia etc de algo
public class Match {
    public static void main(String[] args) {
        
        AlunoF a1 = new AlunoF("Ana", 7.1);
        AlunoF a2 = new AlunoF("Luna", 7.1);
        AlunoF a3 = new AlunoF("Gui", 8.1);
        AlunoF a4 = new AlunoF("Gabi", 10);

        List<AlunoF> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<AlunoF> aprovado = a -> a.nota >= 7;
        Predicate<AlunoF> reprovado = aprovado.negate();

        System.out.println(alunos.stream().allMatch(aprovado));
        //se nao estiver no parametro desejado >= 7 resultara falso
        System.out.println(alunos.stream().anyMatch(aprovado)); //se tiver algum no criterio
        System.out.println(alunos.stream().noneMatch(reprovado)); //se nenhum criterio corresponder, negate = nega o predicado
    }
}
