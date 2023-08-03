package PadroesObserver;

import java.util.Date;

public class EventoChegadaAnivers {//captura eventos e acoes do usuario
    
    private final Date momento;

    public EventoChegadaAnivers(Date momento){
        this.momento = momento;
    }

    public Date getMomento(){
        return momento;
    }
}
