package PadroesObserver;

public class AniversSurpresa {
    public static void main(String[] args) {
        NamoradaAniv namorada = new NamoradaAniv();
        Porteiro porteiro = new Porteiro();
        
        porteiro.registrarObservador(namorada);
        //criado a lista de observadores, ira notificar o interessado do evento
        
        porteiro.registrarObservador(e -> 
        {System.out.println("Surpresa!!(Lambda)");
        System.out.println("Ocorreu em: " + e.getMomento());
        //a func lambda pode ser interpretada como outro observador interessado
    });
        
        porteiro.monitorar();
    }
}
