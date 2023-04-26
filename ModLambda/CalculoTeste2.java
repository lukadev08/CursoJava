package ModLambda;

public class CalculoTeste2 {
    public static void main(String[] args) {
        
        Calculo calculo = (x, y) -> {
            return x + y;
        }; // Calculo exec=(param1, param2) -> 'func. lambda' necessita de um retorno para
           // resultado do parametro

        System.out.println(calculo.exectuar(2, 4));
        
        calculo = (x, y) -> x * y; //implicitamente o return ja e imposto na sentenca
        System.out.println(calculo.exectuar(2, 4));//aqui a ordem do print output influencia na resposta final
    }
}
