package Generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        //<> especifica o tipo do generic, nao precisando de cast
        caixaA.guardar("Segredo");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);
        
        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.1415);

        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }
}
