package Arrays.Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunca {
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double => Double
        conjunto.add(true); // boolean => Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int => Int
        conjunto.add('x'); // char => Char
        //o metodo ira converter os tipos primitivos para objetos

        System.out.println("O Tamanho e: " + conjunto.size());
        
        /* 
        conjunto.add("teste");
        conjunto.add('y'); //adicionando valores ao set
        System.out.println("O Tamanho e: " + conjunto.size());
        */
        
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        // remove retona valor boolean
        System.out.println("O Tamanho e: " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));
        //verifica se o obj esta no conjunto, retorna boolean

        Set nums = new HashSet();
        //outra forma importada de chamar o metodo set
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); //uniao dos conjuntos set
        System.out.println(conjunto);

        conjunto.clear(); //esvazia o conjunto
        System.out.println(conjunto);

    }
}
