import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            //armazena valores
        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1) {
            // --- (!= diferente) -1 sai do loop
            System.out.print("informe a nota ou -1 p/ sair: ");
            nota = input.nextDouble();

        if(nota <= 10 && nota >= 0){ 

            total += nota;
            quantidadeDeNotas++;
        } else if (nota != -1){
            System.out.println("XXX Nota invalida XXX");
        }
    }
      
    //calcular media
        double media = total / quantidadeDeNotas;
        System.out.println("media = " + media);

        input.close();
    }
}
