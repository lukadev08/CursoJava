package ClassesObjetos;

public class AreaCirc {
    
    double raio;
   static final double pi = 3.1415;
   /* cria uma constante ligada a classe, nao muda o valor ao usar a instancia
            final = imutavel*/
    AreaCirc(double raioInicial){
        raio = raioInicial;

    }
    double area(){
        return pi * Math.pow(raio, 2);
    }

    static double area(double raio){
            // nao e o mesmo metodo acima pois esta paramentado o valor raio
        return pi * Math.pow(raio, 2);
                            // o raio sera o da metodo static acima
    }
}
