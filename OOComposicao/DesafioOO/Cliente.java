package OOComposicao.DesafioOO;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    final String nome;
    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    void adicionarCompra (Compra compras){
        this.compras.add(compras);

    }

    double obterValorTotal(){
        double total = 0;

            for(Compra compra: compras){
                total += compra.obterValorTotal(); // pega todos os valores totais das compras
            }

        return total;
    }
    
    
}
