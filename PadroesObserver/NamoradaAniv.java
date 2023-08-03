package PadroesObserver;

public class NamoradaAniv implements ObservadorChegadaAnivers { 
    //namorada = observador ; interessada no evento
    public void chegou(EventoChegadaAnivers evento){
        System.out.println("Avisar os convidados");
        System.out.println("Apagar as luzes");
        System.out.println("Esperar um pouco");
        System.out.println("Surpresa!!1");
    }
}
