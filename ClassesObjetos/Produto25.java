package ClassesObjetos;

public class Produto25 {
    
    String nome;
    double preco;
    static double desconto = 0.25;
   
    Produto25(){

    }

    Produto25(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }

    
    double precoComDesconto(){
        return preco * (1 - desconto);
    }
   
         
    
   
}
