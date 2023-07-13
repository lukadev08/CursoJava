package Streams;

import java.util.Arrays;
import java.util.List;

public class OutrosStream {
    public static void main(String[] args) {
        
        AlunoF a1 = new AlunoF("Ana", 7.1);
        AlunoF a2 = new AlunoF("Luna", 6.1);
        AlunoF a3 = new AlunoF("Gui", 8.1);
        AlunoF a4 = new AlunoF("Gabi", 10);
        AlunoF a5 = new AlunoF("Ana", 7.1);
        AlunoF a6 = new AlunoF("Pedro", 6.1);
        AlunoF a7 = new AlunoF("Gui", 8.1);
        AlunoF a8 = new AlunoF("Maria", 10);

        List<AlunoF> alunos = 
            Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct: ");
        alunos.stream().distinct().forEach(System.out::println); 
        //implementado equals e hashcode na classe de alunos, mostra os resultados distintos(nao duplicados)

        System.out.println("\nSkip/Limit:");
        alunos.stream()
            .distinct()
            .skip(2) //pula "2" elementos a partir do indice
            .limit(2)//limita ate onde os elementos serao mostrados
            .forEach(System.out::println);
        
        System.out.println("\nTake While:");
        alunos.stream()
            .distinct()
            .skip(2)
            .takeWhile(a -> a.nota >= 7) 
            /*imprime se estiver de acordo com a condicao ate o fim dela
            se o 1 elemento estiver >= 7, para a execucao 
            se pula o 1 elemento, imprime os outros ate satisfazer a condicao == (6.1 < 7)
            */
            .forEach(System.out::println);
    }
}
