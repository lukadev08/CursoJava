package DesafioModulo;


/**
 * criar 3 classes 
 * 1- classe pessoa (nome, peso, metodo comer{recebe param da comida})
 * 2- classe comida (2 tipo de comida, nome, peso)
 * acrescentar o peso da comida ao peso da pessoa = pessoa vai ganhando peso com o metodo de comer
 * 3- classe jantar(tera o metodo main para istancias)
 */
public class DesafioModuloJantar {
    public static void main(String[] args) {
        
        ComidaJantar c1 = new ComidaJantar("arroz", 0.450);
        ComidaJantar c2 = new ComidaJantar("feijao", 0.378);
        ComidaJantar c3 = new ComidaJantar("Bife assado", 0.579);
       
        PessoaJantar p1 = new PessoaJantar("Jose", 70.8);

        /*
        System.out.println(c1.nome);
        System.out.println(c2.nome);
        System.out.println(p1.nome);
             
        System.out.printf(p1.nome +" comeu "+ c1.nome+ 
                " e agora pesa " + (c1.peso+p1.peso) + "\n");
        
        System.out.printf(p1.nome +" comeu "+ c2.nome+ 
                " e agora pesa " + (c2.peso+p1.peso)+ "\n");
               
        System.out.printf(p1.nome +" comeu "+ c1.nome+ " com " + c2.nome +
        " e agora pesa " + (c1.peso+c2.peso+p1.peso));
        */
        
        //atualizado
        System.out.println(p1.apresentar()); // ainda nao comeu
        
        p1.comer(c1);
        System.out.println(p1.apresentar());//comeu a comida1
        
        p1.comer(c2);
        System.out.println(p1.apresentar());//comeu a comida2

        p1.comer(c3);
        System.out.println(p1.apresentar());//comeu a comida3

        //metodo 'void comer' vai acrescentando ao valor final ao decorrer das entradas de valores
        

    }
    
}
