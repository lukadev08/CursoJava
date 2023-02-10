package Arrays;

//import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
       System.out.println("Quantas notas deseja informar?");
        
        int notasArmazenadas = input.nextInt();
        

        double[] notasDoAluno = new double[notasArmazenadas];
        
       for(int i = 0; i < notasDoAluno.length; i++){
           System.out.println("Insira a nota " + (i + 1) + ": ");
                                            // vai adicionar ao indice 0(nome) + 1: nota 1:
            notasDoAluno[i] = input.nextDouble();
                // como armazenar no loop a entrada de valores
            
            }
            
//System.out.println(Arrays.toString(notasDoAluno));
        
            double total = 0;
            for(double nota: notasDoAluno){
                // 2 loop utilizando a entrada de valor do loop anterior
                total += nota;
            }
            
            double media = total / notasDoAluno.length;
            System.out.println("La media es: " + media + "." );



        input.close();
    }

}