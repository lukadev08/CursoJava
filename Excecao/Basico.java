package Excecao;

public class Basico {
    public static void main(String[] args) {
        
        try { //snippet = ctrl + shift + t + c
            System.out.println(7 /0);
        } catch (ArithmeticException e) {
            System.out.println("Nao foi possivel dividir " + e.getMessage());
        }

        AlunoF a1 = null;

        try{
            imprimirNomeAluno(a1);

        }catch(Exception excecao){ 
        //try/catch = cria uma excecao podendo designar uma mensagem sobre o erro
            System.out.println("Ocorreu um erro ao imprimir");
        }
       System.out.println("Fim do codigo"); 
    }

    public static void imprimirNomeAluno (AlunoF aluno){
        System.out.println(aluno.nome);
    }
}
