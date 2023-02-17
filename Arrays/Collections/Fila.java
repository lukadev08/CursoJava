package Arrays.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
       
        //ambos add e offer adicionam elementos na fila, difere o comportamento quando a fila esta cheia
        fila.add("Ana"); // retorna falso se tiver vazio
        fila.offer("Bia"); // retorna excecao se tiver vazio
        fila.add("Carlos");
        fila.offer("Dani");
        fila.add("Rafa");
        fila.offer("Gui");

       
        //difere o comportamento quando a fila esta vazia
        System.out.println(fila.peek()); // retorna null caso vazio
       
        System.out.println(fila.element()); // retorna excecao se tiver vazio
        
        // peek e element obtem o proximo elemento da fila sem remover
        
        /*outras opcoes de comando da fila
        * fila.size()
        * fila.clear()
        * fila.isEmpty()
        * fila.contains()
        */
        
        System.out.println(fila.poll()); // percorre todos elementos da fila ate retornar null e esvaziar
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); //retorna null no fim da fila
        
        System.out.println(fila.remove());// retorna excecao
        // poll e remove obtem o proximo elemento da fila e remove 
    }
}
