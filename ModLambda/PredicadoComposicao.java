package ModLambda;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        System.out.println(isPar.and(isTresDigitos).negate().test(123));
        //and = compoe 2 funcoes para o valor definitivo(se tem 3 digitos, mas prevalece par ou impar)
        //negate = nega/inverte a logica da sentenca (prevalece se tem 3 digitos, mas nao interfere ser par ou impar)
        System.out.println(isPar.or(isTresDigitos).test(123));
                                // se for 3 digitos OU eh par
    }
}
