package Excecao.ExcPersonB;

import Excecao.AlunoF;

//excecao checada
public class TesteValid {
        public static void main(String[] args) {
    
        try {
            AlunoF aluno = new AlunoF ("",-7);
            Validar.aluno(aluno);
            
            Validar.aluno(null); //nao pode estar fora do try/catch, deve ser tratado
        } catch (StringVaziaExc e) {
            System.out.println(e.getMessage());
            
        } catch (NumForaIntervaloExc | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Fim :D");

    }
}
