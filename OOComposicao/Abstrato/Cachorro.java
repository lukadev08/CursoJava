package OOComposicao.Abstrato;

public class Cachorro extends Mamifero {
  
    @Override
    public String mover() {
        return "Usando as patas";
    }
    
    // metodos abstratos /\ \/
    
    @Override
    public String mamar() {
        return "Usando leite";
    }
}