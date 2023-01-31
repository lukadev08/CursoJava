package ClassesObjetos;

public class Produto {
    
    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial){
        nome = nomeInicial;
        // explicitando um construtor
        // usando 1 parametro
    }
    Produto(String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial; // 3 construtores
            // usando 3 parametros
    }
        Produto() {
            // o codigo funciona sem precisar do parametro no construtor
            // usando nenhum parametro
    }
        

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
