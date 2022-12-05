import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    String conceito = "";
    System.out.print("Informe a nota: ");
    int nota = input.nextInt();

    switch (nota){
        case 10: case 9: // pode se colocar assim 
            conceito = "A";
                break;
        case 8: case 7:
            conceito = "B";
                break;
        case 6: case 5:
            conceito = "C";
                break;
        case 4: case 3:
            conceito = "D";
                break;
        case 2: 
        case 1:     // ou colocar assim 
            conceito = "E";
                break; 
        default:    // determina o fim das sequencia
            conceito = "nao informado"; 
    }

    System.out.println("O conceito eh: " + conceito);
    
        input.close();
    }
}
