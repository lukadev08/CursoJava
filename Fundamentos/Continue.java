public class Continue {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1) {
        continue;
      }
      System.out.println(i);
    }
    for (int j = 1; j <= 10; j++) {
      if (j == 5)
        continue;
        // interrompe a repeticao e continua apos o ponto determinado 
        //ex: pulou o 5
        // pode se rotular mais de 1 loop no continue com (exemplo: for...) 
        // e designando onde deve ocorrer
        System.out.println(j);
    }
  }
}
