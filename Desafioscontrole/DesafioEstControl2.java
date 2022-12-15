package Desafioscontrole;

import java.util.Scanner;

public class DesafioEstControl2 {
  public static void main(String[] args) {
    // determinar se um ano e bissexto
    
    Scanner input = new Scanner(System.in);
    System.out.println("Insira o ano: ");
    int ano = input.nextInt();

    boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);
    // condicao para calcular se e ano bissexto
    if (bissexto == true){
      System.out.println(ano + " e um ano bissexto");
    } else{
      System.out.println(ano + " nao e um ano bissexto");
    }
    input.close();  
  }
}
