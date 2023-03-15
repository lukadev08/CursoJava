package OOComposicao.heranca;

public class Monstro extends Jogador{

    public Monstro(){
        this(0, 0); //o construtor this chama o construtor abaixo\/
    }   // pode se setar o paramentro na classe main
   
    Monstro(int x, int y){
        super(x, y); // que chama o construtor padrao da classe pai
    }

    public boolean atacar (Jogador oponente){
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
