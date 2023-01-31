package ClassesObjetos.DataDesafio;

public class DataTeste {
    public static void main(String[] args) {
        
        Data d1 = new Data();
        // data default pelo construtor

        var d2 = new Data(11, 10, 2001);
            //data explicita usando construtor
        
        var d3 = new Data();
        d3.dia = 25;
        d3.mes = 07;
        d3.ano = 2022;
            //explicitado de modo padrao
            
        String dataFormat1 = d1.obterDataFormat();
        
        System.out.println(dataFormat1);
                            // utilizando metodo de retorno
                            
        System.out.println(d2.obterDataFormat());
        //desafio --- cod. limpo
        
        System.out.println(d3.obterDataFormat());
       
        // System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);
        
                    /*lembrete: formata a saida 
                    double pra 'string'
                    \n: quebra linha
                    */ 
        //d1.imprimirDataFormat();
       // d2.imprimirDataFormat();
        // formas menores de usar o metodo (apenas terminal)

       
    }
}
