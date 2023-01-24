package ClassesObjetos.DataDesafio;

public class DataTeste {
    public static void main(String[] args) {
        
        Data d1 = new Data();
        d1.dia = 8;
        d1.mes = "Nov";
        d1.ano = 1996;

        var d2 = new Data();
        d2.dia = 11;
        d2.mes = "Out";
        d2.ano = 2001;

        System.out.printf("%d/%s/%d\n", d1.dia, d1.mes, d1.ano);
       
        System.out.printf("%d/%s/%d", d2.dia, d2.mes, d2.ano);
        /*lembrete: formata a saida 
                    /*lembrete: formata a saida 
                    double pra 'string'

                    \n: quebra linha
                    */ 
    }
}
