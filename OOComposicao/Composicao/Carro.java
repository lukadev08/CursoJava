package OOComposicao.Composicao;

public class Carro {
    
    Motor motor;

    Carro(){
        this.motor = new Motor(this);//metodo para criar relacao bidirecional entre objetos
    }
    
    void acelerar(){
        if(motor.fatorInjecao < 2.6){ //delimita um valor max.
            motor.fatorInjecao += 0.4;

        }
    }

    void frear(){
        if(motor.fatorInjecao > 0.5){ // delimita um valor min
            motor.fatorInjecao -= 0.4;

        }
    }

    void ligar(){
        motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado;
    }
}
