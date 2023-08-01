package Generics;

public class Caixa<T> { //<"**"> cria um generics, pode ser diferentes tipos de variaveis
   
    private T coisa;

    public void guardar(T coisa){
        this.coisa = coisa;
    }

    public T abrir(){
        return coisa;
    }
}
