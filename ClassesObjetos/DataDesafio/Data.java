package ClassesObjetos.DataDesafio;

public class Data {
    
    int dia;
    int mes;
    int ano;
    
    //desafio ----
   
    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
        // default pelo construtor
    }

    Data(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;

    }


    //desafio ----

    String obterDataFormat(){
        return String.format("%d/%d/%d", dia, mes, ano) ;
        // func formatacao
        // funciona em aplicacoes, web, etc
    }


    void imprimirDataFormat(){
        // void = nao tem 'return'
        System.out.println(obterDataFormat());
                // metodo usando outro metodo
                // funciona apenas no terminal
                
    }
    
    
}
