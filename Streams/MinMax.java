package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        
        AlunoF a1 = new AlunoF("Ana", 7.1);
        AlunoF a2 = new AlunoF("Luna", 6.1);
        AlunoF a3 = new AlunoF("Gui", 8.1);
        AlunoF a4 = new AlunoF("Gabi", 10);

        List<AlunoF> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<AlunoF> melhorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0;
        }; //lambda de comparacao entre os objetos
        
        Comparator<AlunoF> piorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return -1;
            if(aluno1.nota < aluno2.nota) return 1;
            return 0;
        }; 

        System.out.println(alunos.stream().max(melhorNota).get());
        //na classe alunof necessitou metodo toString pra mostrar o nome do aluno
        System.out.println(alunos.stream().min(piorNota).get());
        
        System.out.println(alunos.stream().min(melhorNota).get());
        System.out.println(alunos.stream().max(piorNota).get());//logica do max(melhor nota) inversa
    }
}
