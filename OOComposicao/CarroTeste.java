package OOComposicao;

public class CarroTeste {
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());
        
        c1.ligar();
        System.out.println(c1.estaLigado());
        
        System.out.println(c1.motor.giros());
        
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        // func acelerar o carro = giros + fatorinj 0.4

        System.out.println(c1.motor.giros());
        
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        // func acelerar o carro = giros - fatorinj 0.4

        System.out.println(c1.motor.giros());

        System.out.println(c1.motor.carro.motor.carro.motor.giros());
        // o carro tem um motor e um motor tem um carro etc = relac bidirecional

    }
}
