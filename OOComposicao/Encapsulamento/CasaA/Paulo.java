package OOComposicao.Encapsulamento.CasaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos(){
    // segredo
    // facoDentroDeCasa
    // formaDeFalar
    // todosSabem
    
      //  System.out.println(esposa.segredo); >> metodo privado
        System.out.println(esposa.facoDentroDeCasa); // metodo do mesmo pacote
        System.out.println(esposa.formaDeFalar); // heranca(protected) do mesmo pacote
        System.out.println(esposa.todosSabem); // metodo publico
        
    }

}
