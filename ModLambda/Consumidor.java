package ModLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
    
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
            //funcao lambda recebe um unico Tipo e retorna nenhum resultado
                
        Produto p1 = new Produto("\nCaneta azu", 12.34, 0.09);
        imprimirNome.accept(p1);
        
        Produto p2 = new Produto("Borracha", 7.50, 0.03);
        Produto p3 = new Produto("Computer", 2908.99, 0.25);
        Produto p4 = new Produto("Mochila", 123.24, 0.17);
        Produto p5 = new Produto("Lapizera", 9.80, 0.05);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        produtos.forEach(imprimirNome);

        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println); 
    }
        
}