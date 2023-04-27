package ModLambda;

import java.util.Arrays;
import java.util.List;

public class ForEachLamb {
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Ju", "Joca");

        System.out.println("Forma tradicional");
        for(String nome: aprovados){
            //para cada 'nome' = aprovados \/
            System.out.println(nome);
        }
        System.out.println("\nForma Lambda 01");
    
        aprovados.forEach((nome) -> System.out.println(nome + "!"));
                        // /\com 1 parametro pode ficar sem (); em uma unica sentenca simples pode ficar sem {} em {sysout(nome);});
        
        System.out.println("\nMethod Reference");
        aprovados.forEach(System.out::println); //conteudo da lista parametrado de uma referencia para o println 
        
        System.out.println("\nLambda 02");
        aprovados.forEach(nome -> meuImprimir(nome));//funcao lambda personalizada pelo metodo statc
        
        System.out.println("\nMethod Reference 02");
        aprovados.forEach(ForEachLamb::meuImprimir);
                            //referencia o nome da classe
    }
    static void meuImprimir(String nome){
        System.out.println("Ola, mi nombre es " + nome);
    }
    
}
