package OOComposicao.DesafioHeranca;

public class Carro {
    
    int velAtual = 0;

    void acelerar(){
        velAtual += 5;
    }

    void frear(){ // nao pode gerar valor negativo
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
