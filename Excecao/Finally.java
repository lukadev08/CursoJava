package Excecao;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(7 / entrada.nextInt());
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally #01");
        }
            //finally obriga a execucao apesar de algum erro
            
        try{
            System.out.println(7 / entrada.nextInt());
        } finally {
            System.out.println("Finally #02");

            entrada.close();
            // -->finally 'fecha' os recursos em aberto
        }
        
    }
}
