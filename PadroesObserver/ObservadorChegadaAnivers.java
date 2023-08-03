package PadroesObserver;

@FunctionalInterface 
//cria a oportunidade de usar apenas uma lambda inves de criar o obj namorada no metodo main
public interface ObservadorChegadaAnivers {
    //acao de chegada do evento;notificar
    public void chegou(EventoChegadaAnivers evento);
}
