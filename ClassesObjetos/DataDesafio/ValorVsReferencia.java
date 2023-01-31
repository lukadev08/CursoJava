package ClassesObjetos.DataDesafio;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // atribuicao por valor (tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2002);
        Data d2 = d1; // atribuicao por referencia (objeto)

        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2025;

        System.out.println(d1.obterDataFormat());
        System.out.println(d2.obterDataFormat());
        
        voltarDataParaValorPadrao(d1);
        // altera o endereco de memoria referente ao objeto d1

        System.out.println(d1.obterDataFormat());
        System.out.println(d2.obterDataFormat());


        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
        /*  foi gerada uma copia, mas o tipo 
        primitivo nao se altera
        */
    }
    static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
    // um metodo static pode acessar outro metodo static

    static void alterarPrimitivo(int a){
        a++;
    }
}
