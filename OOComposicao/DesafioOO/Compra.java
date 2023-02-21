package OOComposicao.DesafioOO;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    
    final List<Item> itens = new ArrayList<>();

    void adicionarItem (Produto p, int quantidade){// recebe da classe produto
        this.itens.add(new Item(p, quantidade));
    }
    
    void adicionarItem (String nome, double preco, int quantidade){
        var produto = new Produto(nome, preco);// instancia um produto e adiciona um item na compra
        this.itens.add(new Item(produto, quantidade));
    }

    double obterValorTotal(){ // da compra em si
        double total = 0;

            for(Item item: itens){
                total += item.quantidade * item.produto.preco;
            }

        return total;
    }
}
