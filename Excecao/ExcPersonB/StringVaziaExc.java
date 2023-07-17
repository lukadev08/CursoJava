package Excecao.ExcPersonB;

// @SuppressWarnings ("serial")
public class StringVaziaExc extends Exception {
    
    private String nomeDoAtributo;
  
    public StringVaziaExc (String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {

        return String.format("O atributo %s esta vazio", nomeDoAtributo);
    }
}
