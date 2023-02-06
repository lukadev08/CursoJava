package ClassesObjetos.DataDesafio;


public class PrimeiroTraumaDesafio {
    
    int a = 3; /*desafio: como acessar
                 essa variavel
                sem alterar ele?
                o atributo pertence a instancia:
                            PrimeiroTraumaDesafio   
                */

    static int b = 4; /* este metodo estatico pode ser 
                        acessado diretamente pois esta
                        declarado static
                         */
    public static void main(String[] args) {
        
      PrimeiroTraumaDesafio p = new PrimeiroTraumaDesafio();
    // instancia >p usada para acessar a variavel
        System.out.println(p.a);
                        // . ---> para acessar a instancia "a"
        System.out.println(b);
    }
}
