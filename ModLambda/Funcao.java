package ModLambda;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        
        Function<Integer, String> parOuImpar = 
            //param entrada ; param saida
                numero -> numero % 2 == 0 ? "Par" : "Impar";    
                                // : condicionamento "ou"
            
            Function<String, String> oResultadoE =
                valor -> "O resultado e: " + valor;
            
            Function<String, String> empolgado = 
                valor -> valor + "!!!";//pode se encadear as funcoes entre as outras para reutilizacao do processo
            
            String resultadoFinal = parOuImpar
            .andThen(oResultadoE)
            .andThen(empolgado)
            // concatena no valor final a ser impresso o resultado das 2 funcoes, pois a 1
            // funcao retorna uma string e a 2 recebe esse valor em string
            .apply(30);
            
            System.out.println(resultadoFinal);

            System.out.println(parOuImpar.apply(27)); //aplly = aplica a funcao para executar o parametro
    }
}
