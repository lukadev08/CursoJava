package OOComposicao;

public class Motor {
    
    final Carro carro;

    boolean ligado = false;
    double fatorInjecao = 1; //alusao a entrada de combustivel

    Motor (Carro carro){
        this.carro = carro; //metodo para criar relacao bidirecional entre objetos
    }

    int giros(){
        if(!ligado){
            return 0;
        } else{
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
