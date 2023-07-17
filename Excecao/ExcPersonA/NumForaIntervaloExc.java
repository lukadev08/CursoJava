package Excecao.ExcPersonA;

// @SuppressWarnings ("serial")
public class NumForaIntervaloExc extends RuntimeException {
    
    private String nomeDoAtributo;
  
    public NumForaIntervaloExc (String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {

        return String.format("O atributo %s esta negativo", nomeDoAtributo);
    }
}
