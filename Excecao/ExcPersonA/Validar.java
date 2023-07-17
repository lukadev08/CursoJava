package Excecao.ExcPersonA;

import Excecao.AlunoF;

public class Validar {
    
    private Validar() {}

    public static void aluno (AlunoF aluno){

        if(aluno == null){
            throw new IllegalArgumentException("O aluno esta nulo");
        }

        if(aluno.nome == null || aluno.nome.trim().isEmpty()){ //.trim gera espacos em branco
            throw new StringVaziaExc("nome");
        }
        
        if(aluno.nota < 0 || aluno.nota > 10){
            throw new NumForaIntervaloExc("nota");
        }
    }
}
