package Generics;

public class CaixaObjTeste {
    public static void main(String[] args) {
        CaixaObj caixaA = new CaixaObj();
        caixaA.guardar(2.3);//double -> Double

        Double coisaA = (Double)caixaA.abrir();
        System.out.println(coisaA);
        /*um Object pode armazenar diferentes tipos de dados 
        *no java um object nao consegue realizar um cast
        para outro tipo implicitamente
        deve ser feito explicitamente no codigo 
        */
        
        CaixaObj caixaB = new CaixaObj();
        caixaA.guardar("Ola");
    
        String coisaB = (String)caixaB.abrir();
        System.out.println(coisaB);
    }
}
