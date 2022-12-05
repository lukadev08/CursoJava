import java.util.Scanner;

public class WhileIndertem {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")) {
                // --- enquanto a variavel ex:!valor nao for digitada,
                // continua sendo executada
            System.out.print("digite algo: ");
            valor = input.nextLine();
        }

        input.close();
    }
}
