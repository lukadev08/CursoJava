package Generics;

import java.util.List;

public class ListaUtil {
    
    public static Object getUltimo1(List<?> lista){ //<?> = qualquer tipo 
        return lista.get(lista.size() - 1); //pega o ultimo elemento da lista
    
    }

    public static <T> T getUltimo2(List<T> lista){  //objeto definido sera como tipo <T> generico
    return lista.get(lista.size() - 1); 

    }

}
