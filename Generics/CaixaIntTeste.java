package Generics;

public class CaixaIntTeste {
    public static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(123);
        /*herdou o tipo da classe CaixaInt 
        especificado resolvendo o tipo generico */

        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
