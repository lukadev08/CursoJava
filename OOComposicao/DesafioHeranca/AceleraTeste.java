package OOComposicao.DesafioHeranca;

public class AceleraTeste {
    public static void main(String[] args) {
        
        Carro c1 = new Twingo(); //pode usar a classe generice Carro

        c1.acelerar();
        System.out.println(c1);
       
        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);
        
        System.out.println();

        Lamborghini c2 = new Lamborghini(); // ou a classe especifica por heranca
        c2.acelerar();
        System.out.println(c2);
       
        c2.acelerar();
        System.out.println(c2);
       
        c2.acelerar();
        c2.frear();
        System.out.println(c2);
    }
}
