package OOComposicao.heranca.DesafioHeranca;
//a classe atribuida a interface e obrigada a usar os metodos void definidos da interface
public interface Luxo {
    
    void ligarAr();
    void desligarAr();
    
    default int velocidadeDoAr(){ //metodo default se torna opcional de uso em uma classe
        return 1;
    }
}
