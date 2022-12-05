import java.util.Scanner;

public class IfLoop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a media: ");
        double media = input.nextDouble();

        if(media <= 10 && media >= 7.0) { 
                 // delimita os valores no range (ate 10 + operacao E)
            System.out.println("aprovado");
            System.out.println("parabens!");
        }
                // {} associa tudo dentro do loop a ele
        if(media < 7 && media >= 4.5) { 
            System.out.println("recuperacao");
        }
        boolean criterioReprovacao = media <4.5 && media >= 0;
            // usando outras variaveis p/ utilizar o loop
        if(criterioReprovacao) { 
            System.out.println("reprovado");
        }

        input.close();
    }
}
