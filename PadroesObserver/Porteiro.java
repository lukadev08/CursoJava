package PadroesObserver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
    //subject = detecta os eventos para o observador

    private List<ObservadorChegadaAnivers> observadores = new ArrayList<>();

    public void registrarObservador(ObservadorChegadaAnivers observador){
        observadores.add(observador); //adiciona alvos a serem observados
    }

    public void monitorar(){
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while(!"sair".equalsIgnoreCase(valor)){ //loop executa ate a resposta satisfazer o objetivo = sim || sair
            System.out.println("Aniversariante chegou?");
            valor = entrada.nextLine();

            if("sim".equalsIgnoreCase(valor)){
                //cria o evento
                EventoChegadaAnivers evento = 
                new EventoChegadaAnivers(new Date());
                
                //notificar os observadores
                observadores.stream()
                .forEach(o -> o.chegou(evento));//percorre a lista de observadores
                valor = "sair";
            } else {
                System.out.println("Alarme falso");
            }
        }
        entrada.close();
    }
}
