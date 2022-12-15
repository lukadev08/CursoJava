package Desafioscontrole;

import java.util.Scanner;
// determinar se um numero digitado eh par e esta entre 0 e 10
public class DesafioEstControl1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Escreva o numero: ");
    int numero = input.nextInt();

    if (numero >= 0 && numero <= 10) {
        // determina se o numero corresponde no intervalo dos numeros
			if (numero % 2 == 0) {
        // se o resto da divisao do numero por 2 for 0
        System.out.println("O numero " + numero + " esta entre 0 e 10, numero par");
      } else {
        //se nao estiver no 1 criterio
        System.out.println("O numero " + numero + " esta entre 0 e 10 mas nao e par");
      }
    } else {
      // se nao estiver em nenhum dos 2 criterios
      System.out.println("O numero " + numero + " nao esta entre 0 e 10");

      
    } 

    input.close();
  }
}
