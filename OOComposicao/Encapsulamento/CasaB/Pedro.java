package OOComposicao.Encapsulamento.CasaB;

import OOComposicao.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {

   /* Ana mae = new Ana(); o acesso de heranca nao pode se fazer 
   a partir de um objeto, pois ja e herdado pela classe (extends)

   */
   
    
    void testeAcessos(){
        
        //  System.out.println(mae.segredo); >> metodo privado
        //  System.out.println(mae.facoDentroDeCasa); >> metodo do pacote casa A = nao acessivel
        
        System.out.println(formaDeFalar); // acessa o metodo diretamente pela heranca da classe
        System.out.println(todosSabem); // metodo publico
        
    }

}