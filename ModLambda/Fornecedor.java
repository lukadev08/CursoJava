package ModLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        
        //nao recebe nenhum parametro e vai retornar algum valor
        Supplier<List<String>> umLista = 
            () -> Arrays.asList("Ana", "Bel", "Lia", "Gui");

        System.out.println(umLista.get());
    }
}
