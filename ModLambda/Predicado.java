package ModLambda;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        
        Predicate<Produto> isCaro = 
            prod -> (prod.preco *(1 - prod.desconto)) >= 750;
            //checa o valor da variavel utilizando boolean, usando parametros de outra classe para validar as opcoes de valores

        Produto produto = new Produto("Notebook", 3893.89, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
