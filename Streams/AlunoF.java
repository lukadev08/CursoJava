package Streams;

public class AlunoF {
    
    final String nome;
    final double nota;
    final boolean bomComportamento;
    
    public AlunoF(String nome, double nota) {
        this(nome, nota, true);
    }
    
    public AlunoF(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }
    
}
