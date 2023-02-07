package ClassesObjetos.DataDesafio;

public class ValorNulo {
    public static void main(String[] args) {
        
        String s1 = "";
        System.out.println(s1.concat("!!!"));

        String s2 = Math.random() > 0.5 ? "opa" : null;
            if(s2 !=null){
                System.out.println(s2.concat("????"));
            }

       
        Data d1 = Math.random() > 0.5 ? new Data() : null; //math.random da valores entre 0.0 e 1.0
                            // se random for > 0.5 cria novo obj Data se nao = null
            if (d1 != null){ //check se o valor na memoria esta nulo ou nao
                d1.mes = 3;
                System.out.println(d1.obterDataFormat());
            }
    }
}
