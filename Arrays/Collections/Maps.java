package Arrays.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {
    public static void main(String[] args) {
        // estrutura chave, valor

        Map<Integer, String> usuarios = new HashMap<>();
         //param de 2 tipos nao primitivos
         usuarios.put(1, "Roberval"); 
         /* metodo put adiciona ao map e caso
         ja exista algo ele substitui
         */
        usuarios.put(2, "Rod"); 
        usuarios.put(3, "Joe"); 
        usuarios.put(4, "Banana"); 

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); // printa o conjunto das chaves(nao ordenada necessariamente)
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());// printa o valor geral do map

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Rod")); // ambos checam o valor selecionado (boolean)

        System.out.println(usuarios.get(3));// busca o valor pela chave
        System.out.println(usuarios.remove(1));// remover chave do map
        System.out.println(usuarios.remove(1, "Joe"));// remover chave do map/valor, se nao tiver o valor ele retorna false

        for(int chave: usuarios.keySet()){
            System.out.println(chave); // percorre as chaves
        }

        for(String valor: usuarios.values()){
            System.out.println(valor);//percorre a outra variavel referente aos valores
        }

        for(Entry<Integer, String> registro: usuarios.entrySet()){ 
            System.out.println(registro.getKey() + " |v| ");
            System.out.println(registro.getValue());
        } // printa todos valores do maps
    }
}
