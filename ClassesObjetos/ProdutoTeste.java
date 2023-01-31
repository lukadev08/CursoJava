package ClassesObjetos;

public class ProdutoTeste {
    public static void main(String[] args) {
        /*estando no mesmo pacote nao e necessario
         importar o metodo de outro lugar
         */
    Produto p1 = new Produto("Notebook", 4056.90, 0.25); /*usando construtores explicitos, 
                                                                                            inicializando objeto em apenas 1 linha*/
    /*classe ---- construtor
         p1.nome = "Notebook";
         p1.preco = 4056.90;
         p1.desconto = 0.25;
            -- atributos */

    var p2 = new Produto();
        p2.nome = "Caneta Azul";
        p2.preco = 10.50;
        p2.desconto = 0.29;

    System.out.println(p1.nome);
    System.out.println(p2.nome);

    /*  double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);
    */
    
    double precoFinal1 = p1.precoComDesconto();
                        // utilizando metodo do produto
    double precoFinal2 = p2.precoComDesconto(0.10);
                                            // metodo adicional
    double mediaCarrinho = precoFinal1 + precoFinal2;
   
    System.out.println(precoFinal1);
    System.out.println(precoFinal2);
    System.out.printf("A media do carrinho: R$%.2f", mediaCarrinho);
    }
}
