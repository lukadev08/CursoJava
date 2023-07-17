package Excecao.ExcPersonA;

import Excecao.AlunoF;

public class TesteValid {
        public static void main(String[] args) {
    
        try {
            AlunoF aluno = new AlunoF ("",-7);
            Validar.aluno(aluno);
        } catch (StringVaziaExc e) {
             System.out.println(e.getMessage());
        }

        System.out.println("Fim :D");

    }
}
