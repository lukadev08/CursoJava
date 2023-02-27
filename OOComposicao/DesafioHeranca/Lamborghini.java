package OOComposicao.DesafioHeranca;

public class Lamborghini extends Carro {
    
    //herdando o metodo mas alterando o comportamento da variavel
    @Override
    void acelerar() {
        velAtual += 15; // metodo alterado inerente a esta classe
    }
}
