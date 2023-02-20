package OOComposicao;import java.util.ArrayList;
import java.util.List;

public class Aluno {
    
    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome){
        this.nome = nome;
    }

    void adicionarCurso (Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nome){ //metodo pra procurar um curso pelo nome
        for(Curso curso: this.cursos){
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;// caso nao encontre, retorna nulo
    }

    public String toString(){// converte os objetos para uma String
        return nome;
    }
}
