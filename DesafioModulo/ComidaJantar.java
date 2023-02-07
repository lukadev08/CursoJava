package DesafioModulo;

public class ComidaJantar {
    
    String nome;
    double peso;

    ComidaJantar(String nomeComida, double pesoComida){
        nome = nomeComida;
        peso = pesoComida;
    
    }

    double comeuComida(){
        return peso;
    }
}
