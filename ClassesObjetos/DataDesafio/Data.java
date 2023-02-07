package ClassesObjetos.DataDesafio;

public class Data {
    
    int dia;
    int mes;
    int ano;
    
    //desafio ----
   /* 
    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
        // default pelo construtor
    }
    */
    Data(){
        this(1,1,1970);//chamando um construtor utilizando parametros (dia,mes,ano)
    }

    /* 
    Data(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;

    }
    */
    
    //desafio ----

    Data(int dia, int mes, int ano){   //objeto de instancia this
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        /*O this.atributo serve para especificar que o atributo que eu
         quero acessar é o que está definido diretamente na classe, 
         e não em qualquer outro lugar, como na função construtora.
         Ou chamar um construtor usando outro construtor dentro da classe.
         */

    }
    /* 
    String obterDataFormat(){
        return String.format("%d/%d/%d", this.dia, mes, ano); //pode utilizar this direto no metodo
        // func formatacao
        // funciona em aplicacoes, web, etc
    }
    */

    String obterDataFormat(){
        final String formato = "%d/%d/%d";// variavel local pertencente a classe obterDataFormat
        // final String = define a variavel uma constante, pode mover para outros lugares mas nao seria local
        return String.format(formato,this.dia, mes, ano); 
       
    }


    void imprimirDataFormat(){
        // void = nao tem 'return'
        System.out.println(obterDataFormat());
                // metodo usando outro metodo
                // funciona apenas no terminal
                
    }
    
    
}
