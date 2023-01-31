package ClassesObjetos;

public class Desafio25Desconto {
    public static void main(String[] args) {
        
        Produto25 p1 = new Produto25("Porta Gatos", 350.00);

        var p2 = new Produto25();
        p2.nome = "Caneta Azul";
        p2.preco = 10.50;

        Produto25.desconto = 0.50;
        /*  explicitando a modificacao de todos os produtos
            se nao for explicitado, ira usar o valor
             definido no objeto de fora
        */
        
        System.out.println(p1.nome + ": " + p1.precoComDesconto());
        System.out.println(p2.nome + ": " + p2.precoComDesconto());
    
       
    }
}
