package Arrays.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        
       // Set<String> listaAprovados = new HashSet<>();
            //<todo conteudo dentro sera do mesmo tipo> 
       SortedSet<String> listaAprovados = new TreeSet<>(); //ordena a lista
       //ordenacao na ordem de secao
        listaAprovados.add("Joao");
        listaAprovados.add("Caio");
        listaAprovados.add("Luna");
        listaAprovados.add("Ana");
        //tipo homogeneo

        for(String candidato: listaAprovados){
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();//exemplo com int(Interger)
        nums.add(1);
        nums.add(3);
        nums.add(125);
        nums.add(7);
        //nums.get(1); nao e possivel acessar pelo indice
        
        for (int n: nums){
                //cast obj > primtv
            System.out.println(n);
        }
        
    }
}
