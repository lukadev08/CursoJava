package Generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {
    
    private final Set<Par<C, V>> itens = new LinkedHashSet<>();//garante a ordem de inclusao dos elementos

    public void adicionar(C chave, V valor){
        if(chave == null) return; //caso a chave seja nula sai da execucao do metodo
        
        Par<C, V> novoPar = new Par<C,V>(chave, valor);
        
        if(itens.contains(novoPar)){
            itens.remove(novoPar);
        } //cria um novo par substituindo um valor ja existente
        
        itens.add(novoPar);
    }
    
    public V getValor(C chave){
        if(chave == null) return null; 

        Optional<Par<C,V>> parOpcional = itens.stream()
                .filter(par -> chave.equals(par.getChave()))
                .findFirst();

        return parOpcional.isPresent() 
            ? parOpcional.get().getValor() : null;
    }
}
