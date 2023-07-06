package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimirObj {
     public static void main(String[] args){

        List<String> aprovados = Arrays.asList("Lu", "Guigo", "Juca", "Ana");
        
        System.out.println("modo For each:");
        for (String nome: aprovados){
            System.out.println(nome);
        }
        System.out.println("\nmodo Iterator:");
        Iterator<String> it = aprovados.iterator(); //percorre a lista perguntando se ha proximo termo
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("\nmodo Stream:");
        Stream<String> stream = aprovados.stream(); //usa uma funcao para pegar uma sequencia de dados
        stream.forEach(System.out::println); //faz um laco interno e aponta para a funcao print
    }
}
