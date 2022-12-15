
public class Break {
  public static void main(String[] args) {
    for (int i =0; i < 10; i++) {
      if (i == 5){
        break;
        // interrompe a execucao ate o pornto determinado = i->conta ate 5
        //vai pro fim do loop e termina a execucao
      }
      System.out.println(i);
    }
    System.out.println("end");
  }
}
