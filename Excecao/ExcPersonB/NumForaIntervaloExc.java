package Excecao.ExcPersonB;

// @SuppressWarnings ("serial")
public class NumForaIntervaloExc extends Exception {
    
    private String nomeDoAtributo;
  
    public NumForaIntervaloExc (String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {

        return String.format("O atributo %s esta negativo", nomeDoAtributo);
    }
}
