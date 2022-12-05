import java.util.Scanner;

public class DesafioCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //interface
        System.out.print("Informe o numero ");
        double num1 = input.nextDouble();
        
        System.out.print("Informe o numero ");
        double num2 = input.nextDouble();
        
        System.out.print("Informe a operacao ");
        String op = input.next();
        

        //logica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
                        // %num1 %op %num2
    input.close();
    }
}
