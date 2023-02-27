package OOComposicao.heranca;

public class Monstro extends Jogador{
    boolean atacar (Jogador oponente){
        int deltaX = Math.abs(x - oponente.x); 
        int deltaY = Math.abs(x - oponente.y);

        if(deltaX == 0 && deltaY == 1){ 
            oponente.vida -= 5;
            return true;
        } else if(deltaX == 1 && deltaY == 0){
            oponente.vida -= 5;
            return true;
        } else {
            return false;
        }
    }
    
}
