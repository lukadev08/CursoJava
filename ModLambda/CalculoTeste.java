package ModLambda;

public class CalculoTeste {
    public static void main(String[] args) {
        
        Calculo calculo = new Somar();
        System.out.println(calculo.exectuar(2, 4)); //chama o uso da interface
        
        calculo = new Multiplicar();
        System.out.println(calculo.exectuar(2, 4)); 
        //nota-se o variavel 'calculo' permanece igual porem usa outro objeto para o resultado
    }
}
