package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtDeAlunos = input.nextInt();
       
        System.out.println("Quantas notas por aluno? ");
        int qtDeNotas = input.nextInt();

        double[][] notasDaTurma = new double[qtDeAlunos][qtDeNotas];
        //matriz de 2 dimensoes [[]] exterior => interior

        double total = 0;
        for(int a = 0; a < notasDaTurma.length; a++){
           //loop primario percorrera a quantidade de alunos
            for(int n = 0; n < notasDaTurma[a].length; n++){
                //loop interno percorrera as notas de um aluno
            
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                    notasDaTurma[a][n] = input.nextDouble();
                    /*vai receber os respectivo
                     *valores inseridos(aluno/notas)
                     */
                total += notasDaTurma[a][n];
                
            }
        }
        double media = total / (qtDeAlunos * qtDeNotas);
        System.out.println("A media da turma e: " + media);

        for(double[] notasDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }   /*  quando estiver percorrendo o array notasDaturma
            no loop mais externo sera um array de double tambem
            result: ira mostrar as notas [][][] de cada aluno 
            */

        input.close();
    }
}
