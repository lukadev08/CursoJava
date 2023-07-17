package Excecao;

public class Causa {
    public static void main(String[] args) {
        
    //excecoes que causam outras excecoes(e causam outras)

        try {
            metodoA (null);  
        } catch (IllegalArgumentException e) {
            if(e.getCause() != null){
                System.out.println(e.getCause().getMessage()); //vai mostrar a msg que causou inicialmente a exception
            }
        }

        System.out.println();

        metodoA (null);  
    }
   
    static void metodoA (AlunoF aluno){
        try {
            metodoB(aluno);
        } catch (Exception causa) {
            throw new IllegalArgumentException(causa); //forma de tratar esta excecao
        }
        }
    
    static void metodoB (AlunoF aluno){
        if(aluno == null){
            throw new NullPointerException("Aluno esta nulo!!");
        }

        System.out.println(aluno.nome);
    }
}
