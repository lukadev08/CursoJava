package OOComposicao.Composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    
   final String nome;
   final List<Aluno> alunos = new ArrayList<>(); /* constante final vai manter o msm endereco de memoria,
                                                 a variavel/intancia se mantem a mesma
                                                 o conteudo pode ser variavel, mas a estrutura base nao
    */
    
    Curso(String nome){
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    
    }
}
