package Arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        
    double[] notasAlunoA = new double[4];
    //  var  array             obj      quant de param
    notasAlunoA[0] = 7.9;
    notasAlunoA[1] = 8;
    notasAlunoA[2] = 6.7;
    notasAlunoA[3] = 9.7;
    //input de valores

    
    System.out.println(Arrays.toString(notasAlunoA));
    // metodo para imprimir valores do array
    System.out.println(notasAlunoA[0]);
    System.out.println(notasAlunoA[notasAlunoA.length - 1]);
    //modos de acessar um valor no array'      length - 1 = comprimento do array sera o ultimo valor
    
    double totalAlunoA = 0;
    // var declarada
    for(int i = 0; i < notasAlunoA.length; i++){
        /* inicio do indice, 
        < notasAlunoA.length = sai do loop apos percorrer todo array
        i++ = conta a partir do indice ate o fim dele = 3
        */
        totalAlunoA += notasAlunoA[i];
    }
    System.out.println(totalAlunoA / notasAlunoA.length); 
    // .length percorre todo o array fazendo a  media
    
   
    final double notaArmazenada = 5.9;
            // pode se usar uma constante dentro do array
    double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
                             // valores inseridos diretamente(menos comum)
    double totalAlunoB = 0;
    for(int i = 0; i < notasAlunoB.length; i++){
        totalAlunoB += notasAlunoB[i];
    }
    
    System.out.println(Arrays.toString(notasAlunoB));
    System.out.println(totalAlunoB / notasAlunoB.length);

    }
}
