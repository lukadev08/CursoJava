import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
      
    System.out.println("Digite o dia: ");
        
    String dia = input.next();
    
//  if(dia == "domingo") {
        // ----- == nao compara string
//     System.out.println(1);
//  }
        
  
  // ----forma que nao da certo /\


// if(dia.equalsIgnoreCase("domingo")) {
//     System.out.println(1);
        // ---- .equalsIgnoreCase = compara strings independente de maiusc ou minusc.
        // ----ambas formas muda a posicao do obj ou string, da certo
//  }
   
  
  if("domingo".equalsIgnoreCase(dia)) {
        System.out.println(1);
    } else if ("segunda".equalsIgnoreCase(dia)) {
        System.out.println(2);
    } else if ("terca".equalsIgnoreCase(dia)) {
        System.out.println(3);
    } else if ("quarta".equalsIgnoreCase(dia)) {
        System.out.println(4);
    } else if ("quinta".equalsIgnoreCase(dia)) {
        System.out.println(5);
    } else if ("sexta".equalsIgnoreCase(dia)) {
        System.out.println(6);
    } else if ("sabado".equalsIgnoreCase(dia) || "sábado".equalsIgnoreCase(dia)) {
                                            //OU outra forma de escrita (ex:acento)
        System.out.println(7);
    } else {
        System.out.println("dia invalido");
    }
    

        input.close();


    }
}
