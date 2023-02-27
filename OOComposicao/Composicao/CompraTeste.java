package OOComposicao.Composicao;

/**Relacionamento 
 * um para muitos
 */

public class CompraTeste {
    public static void main(String[] args) {
        
        Compra compra1 = new Compra();
        compra1.cliente = "Jose Zinho";
       // compra1.itens.add(new Item("Caneta", 20, 7.45)); // metodo add manual de array unidirecional 1<=
       
        compra1.adcionarItem(new Item("Caneta", 20, 7.45)); // metodo add manual de array unidirecional 1<=
        compra1.adcionarItem(new Item("Borracha", 12, 3.89));
        compra1.adcionarItem(new Item("Caderno", 3, 18.79)); // usando metodo void pra add item bidirecional =><=
        // lista de array /\
        
        System.out.println(compra1.itens.size());
        System.out.println(compra1.getValorTotal());

        //exemplo relacao bidirecional
        double total = compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
        System.out.println("O valor total e: " + total);
    }
}
