package OOComposicao.heranca;

public class Jogo {
    public static void main(String[] args) {
        
        Monstro monstro = new Monstro();
        monstro.x = 11;
        monstro.y = 10;

        Heroi heroi = new Heroi(); // com a heranca pode se instanciar um jogador como um obj especifico e eles acionam funcoes
        heroi.x = 10;
        heroi.y = 11; 
        
        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida );
        System.out.println();

        monstro.atacar(heroi); //ataque estando em x+y = 30atk
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);
        
        monstro.andar(Direcao.NORTE); // saiu do range e 'heroi' nao pode fazer mais ataques
        monstro.atacar(heroi);
        heroi.atacar(monstro);

                
        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida); // j2 sofreu ataque j1 = -10hp
        
        
        /* ex: andar
        j1.andar(Direcao.NORTE); //uso do enum(parametro da direcao como instancia)
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);
        

        System.out.println(j1.x); // x = 10+2
        System.out.println(j1.y); // y = 10-2
        */
    }
}
