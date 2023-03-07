package OOComposicao.Encapsulamento.CasaB;

import OOComposicao.Encapsulamento.CasaA.Ana;

public class Julia {
    
    void testeAcessos(){
        Ana sogra = new Ana();

        //  System.out.println(sogra.segredo); >> metodo privado
        // System.out.println(sogra.facoDentroDeCasa); >> metodo de outro pacote
        // System.out.println(sogra.formaDeFalar); >> nao herda pois nao tem classe (extends)
            
        System.out.println(sogra.todosSabem); // metodo publico
    }
}
