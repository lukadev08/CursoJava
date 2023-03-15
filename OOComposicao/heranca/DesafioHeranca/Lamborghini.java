package OOComposicao.heranca.DesafioHeranca;

public class Lamborghini extends Carro { // tornar classe public p/ heranca
    
    //parte desafio
    public Lamborghini(){
        this(315); //determina a velocidade max chamada pelo construtor pai com o this
    }

    public Lamborghini(int velocidadeMaxima){
        super(velocidadeMaxima); // chama o construtor this/\
        
        delta = 15; //metodo acelerar implicito\/
    }


    /* 
    //herdando o metodo mas alterando o comportamento da variavel
    @Override
    void acelerar() {
        velAtual += 15; // metodo alterado inerente a esta classe
    }
    */
}
