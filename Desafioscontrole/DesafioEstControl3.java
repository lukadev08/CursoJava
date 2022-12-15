package Desafioscontrole;

import java.util.Scanner;


public class DesafioEstControl3 {
  public static void main(String[] args) {
    // determinar se um numero e primo e refatorar usando switch/case

  int contadorDeDiv = 0;
  Scanner input = new Scanner(System.in);
  System.out.println("\nDigite um num para verificar se e primo");
  int numero = input.nextInt();

  for (int i = 2; i < numero; i++) {
    if (numero % i == 0) {
      contadorDeDiv++;
    }
  }
  //if (contadorDeDiv == 0) {
  //  System.out.println("\nO numero " + numero + "e primo");
  // } else {
  //   System.out.println("\nO numero " + numero + " nao e primo");
  switch (contadorDeDiv){
    // refatorado usando switch/case
    case 0: 
    System.out.println("\nO numero " + numero + "e primo");
    break;
    
    default:
    System.out.println("\nO numero " + numero + " nao e primo");
    }
    input.close();
  }
  }

