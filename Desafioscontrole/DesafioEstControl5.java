package Desafioscontrole;

import java.util.Scanner;

public class DesafioEstControl5 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a palavra: ");
		String palavra = scanner.nextLine();

		char letras[] = palavra.toCharArray();
    // guarda as letras/caracteres dentro de um array

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
      //output das letras linha p/ linha
		}

		scanner.close();
	}
}
  

