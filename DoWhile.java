import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String texto = "";
        
        
        do {
            // executa o trecho {} ao menos uma vez
            System.out.println("Qual a senha pra sair? ");
            System.out.print("Senha para sair: ");
            texto = input.nextLine();
        } while (!texto.equalsIgnoreCase("batata doce"));
        //expressao enquanto (true/false)
        // retorna (do) a operacao ate que seja fechada (while)

         if (texto != "batata doce"){
            System.out.println("senha invalida");
        }
        System.out.println("SAIU COM SUCESSO.");
        input.close();
    }
}
