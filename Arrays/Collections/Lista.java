package Arrays.Collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        
        ArrayList<Usuario> lista = new ArrayList<>();
        // cria um array de lista

        Usuario u1 = new Usuario("Ana Bolena");
        lista.add(u1);// pode se criar um usuario assim /\ ou

        lista.add(new Usuario("Carlo"));
        lista.add(new Usuario("Leo"));
        lista.add(new Usuario("Bola"));
        lista.add(new Usuario("Manuel Gomes"));

        System.out.println(lista.get(3));//acessa o valor escolhido dentro do campo de indice do array
       
        System.out.println(">>>>" + lista.remove(1)); // remove da lista pelos indices
        System.out.println(lista.remove(new Usuario("Leo")));// remove a partir do objeto, retorna valor boolean

        System.out.println("Tem este usuario? " + lista.contains(new Usuario("Manuel Gomes")));// verifica o conteudo de uma lista
        System.out.println("Tem este usuario? " + lista.contains((u1)));
        /* se nao existir o metodo equals no objeto, 
        o que esta no metodo main vai achar
         */

      /* 
        for(Usuario u: lista){
            //for each \/ printa uma consulta da lista
            System.out.println(u.nome);
        }
        */

        for(Usuario u: lista){
            //for each \/ printa o conteudo total da lista
            System.out.println(u.toString());
        }

    }
}
