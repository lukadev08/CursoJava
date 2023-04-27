package ModLambda;

@FunctionalInterface //aplica uma interface funcional para aplicacao da lambda(se usa 1 unico metodo)
public interface Calculo {
    
    public double exectuar(double a, double b); // a,b = parametros

    //pode se usar metodos default e static dentro da @FunctionalInterface, porem com return de uma resposta
}
