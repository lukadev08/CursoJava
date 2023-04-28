package ModLambda;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio {
    public static void main(String[] args) {
        
        Produto p = new Produto("Ipad", 3235.89, 0.13);

        DecimalFormat df = new DecimalFormat("####0.00");
        
        BinaryOperator<Double> prod = (x, y) -> {return p.preco*( 1 - p.desconto);};
        System.out.println("O valor total é: R$" + df.format(prod.apply(p.preco, p.desconto)));

        Function<Double, String> imposto = 
            i -> i >= 2500 ? "8,5% de imposto" : "Isento";
            System.out.println("O tributo sera: " + prod.andThen(imposto).apply(p.preco, p.desconto));

        Function<Double, String> frete = 
            f -> f >= 3000 ? "100R$" : "50R$";
            System.out.println("O frete sera: " + prod.andThen(frete).apply(p.preco, p.desconto));

    }
}
