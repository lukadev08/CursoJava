package Excecao;

public class CheckdVSNaoCheckd {
    public static void main(String[] args) {
       try {
           geraErro1();
       } catch (RuntimeException e) {
           System.out.println(e.getMessage());//try catch para executar a msg de erro
    }
    
    try {
        geraErro2();
    } catch (Exception e) {
           System.out.println(e.getMessage());
       
        }
        System.out.println("Fim :D");
    }
    
    //nao checada ou verificada
    static void geraErro1() {
        throw new RuntimeException("Deu erro !! #1");
       //erros;excecoes intencionais precisam ser "lancados"
    }
    
    //checada ou verificada
    static void geraErro2() throws Exception { //necessario declarar que se pode lancar uma excecao(de compilacao)
      throw new Exception("Deu erro !! #2");
    }
}
