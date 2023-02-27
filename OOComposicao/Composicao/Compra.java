package OOComposicao.Composicao;

import java.util.ArrayList;

public class Compra {
    
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();
    
    void adcionarItem(String nome, int quantidade, double preco){
        this.adcionarItem(new Item(nome, quantidade, preco)); // usa o metodo de baixo pra inserir os valores
    }

    void adcionarItem(Item item){ //associar a compra ao item(caminho inverso item => compra)
        this.itens.add(item);
        item.compra = this;//this = a referencia da compra sendo o proprio item
    }
    

    double getValorTotal(){ // metodo de juntar todos valores da compra 
        double total = 0;

        for(Item item: itens){
            total += item.quantidade * item.preco;
        }

        return total;
    }

}
