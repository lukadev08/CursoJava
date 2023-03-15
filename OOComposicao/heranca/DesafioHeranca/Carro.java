package OOComposicao.heranca.DesafioHeranca;

public class Carro {
    
    //parte do desafio
    final int VELOCIDADE_MAXIMA;
    int velAtual;
    int delta = 5;

    //parte desafio
    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
 /* 
    Carro(){
        this.VELOCIDADE_MAXIMA = velAtual;
    }
*/

    public void acelerar(){
        if(velAtual + delta > VELOCIDADE_MAXIMA){
            velAtual = VELOCIDADE_MAXIMA;
        } else{
            velAtual += delta; //!!!!!
        }
    }

    public void frear(){ // nao pode gerar valor negativo
        if (velAtual >= 5) { // 5 - 5 = 0, nao pode ser 4 por ex pois se torna negativo
            velAtual -= 5;
        }else{
            velAtual -= 0;
        }
    }

    public String toString(){ //descreve no metodo main
        return "Velocidade atual e: " + velAtual + " km/h";
    }

}
