package OOComposicao.heranca;

public class Jogador {
    
    int vida = 100;
    int x;
    int y;

    boolean atacar (Jogador oponente){
        int deltaX = Math.abs(x - oponente.x); // posicao absoluta do numero, caso for -1 = 1 pos
        int deltaY = Math.abs(x - oponente.y);

        if(deltaX == 0 && deltaY == 1){ //o jogador estara acima ou abaixo do oponente, logo pode atacar = 1 'casa de distancia'
            oponente.vida -= 10;
            return true;
        } else if(deltaX == 1 && deltaY == 0){ //o jogador estara ao lado do oponente, logo pode atacar = 1 'casa de distancia'
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
    }

   
   
   
    boolean andar(Direcao direcao){
        switch(direcao){
            case NORTE:     //se a Direcao = norte, logo, y = -1 conforme a orientacao da bussola etc
                y--;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
            case SUL:
                x++;
                break;
    }
    return true;    
        
        //com switch ou loop if
       
        /*
        boolean andar(Direcao direcao)
        if(direcao == Direcao.NORTE);{ 
            y--; 
        }

        return true;  */
    }
}
