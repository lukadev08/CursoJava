import javax.swing.JOptionPane;

public class IfElseLoop {
    public static void main(String[] args) {
        
        String valor = JOptionPane.showInputDialog("informe um numero: ");
        int numero = Integer.parseInt(valor);

        //  if (numero % 2 == 0) {
        //     System.out.println("numero par");
        //  }
        //  if (numero % 2 == 1) {
        //       System.out.println("numero impar");
        //  }
              
        if (numero % 2 == 0) 
                    // == comparar
            System.out.println("numero par");
        else {
            //loop senao
            System.out.println("numero impar");
        }

    }
}
