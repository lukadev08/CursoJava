package OOComposicao.heranca;

public class Heroi extends Jogador { // extends: palavra reservada para atribuir uma heranca de classe
   
    public Heroi(int x, int y){
        super(x, y); //o problema gerado pelo construtor da classe pai
        //se resolve determinando explicitamente o parametro a ser passado dentro do construtor filho = x,y
    }

    public boolean atacar(Jogador oponente){
      boolean ataque1 = super.atacar(oponente); // usa o metodo definido na classe pai: jogador
      boolean ataque2 = super.atacar(oponente); 
      boolean ataque3 = super.atacar(oponente); 
      return ataque1 || ataque2 || ataque3; // caso atk1/2/3 retorne false, o heroi nao ataca, 
                                 // caso retorne true realiza o ataque
    }
   
   
    /* pode se reusar um metodo mas pode se fazer mais simples /\

    boolean atacar (Jogador oponente){
        int deltaX = Math.abs(x - oponente.x); 
        int deltaY = Math.abs(x - oponente.y);

        if(deltaX == 0 && deltaY == 1){ 
            oponente.vida -= 20;
            return true;
        } else if(deltaX == 1 && deltaY == 0){
            oponente.vida -= 20;
            return true;
        } else {
            return false;
        }
    }
    */
    
}
