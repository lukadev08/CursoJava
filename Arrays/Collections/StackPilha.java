package Arrays.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackPilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Principe"); // retorna valor boolean
        livros.push("Don Caixote"); //retorna uma excecao caso ultrapasse um limite determinado do stack
        livros.push("O Robbert");

        System.out.println(livros.peek()); // se vazio retorna nulo
        System.out.println(livros.element()); // se vazio retorna excecao

        for(String livro: livros){
            System.out.println(livro); //for each para percorrer a pilha(tbm funciona no queue)
        }
        
        /* 
        System.out.println(livros.remove());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        */

        // System.out.println(livros.remove()); funciona igual na fila

        // System.out.println(livros.pop());// se vazio retorna 
      
      /*outros comandos stack
       * livros.size()
       * livros.clear()
       * livros.contains()
       * livros.isEmpty()
       */

    }
    
}
