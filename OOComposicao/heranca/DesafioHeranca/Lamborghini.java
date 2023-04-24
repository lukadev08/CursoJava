package OOComposicao.heranca.DesafioHeranca;

public class Lamborghini extends Carro implements Esportivo, Luxo { // tornar classe public p/ heranca
    
    private boolean ligarTurbo;
    private boolean ligarAr;

    //parte desafio
    public Lamborghini(){
        this(315); //determina a velocidade max chamada pelo construtor pai com o this
    }

    public Lamborghini(int velocidadeMaxima){
        super(velocidadeMaxima); // chama o construtor this/\
        
        setDelta(15); //metodo acelerar implicito\/
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true; 
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr){
            return 35;
        } else if(ligarTurbo && ligarAr){
            return 30;
        } else if(!ligarTurbo && !ligarAr){
            return 20;
        }else{
            return 15;

        }
    }

    /* 
    //herdando o metodo mas alterando o comportamento da variavel
    @Override
    void acelerar() {
        velAtual += 15; // metodo alterado inerente a esta classe
    }
    */
}
