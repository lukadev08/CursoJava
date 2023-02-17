package Arrays.Collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Andrea"));
        usuarios.add(new Usuario("Gustavo"));
        
        boolean resultado = usuarios.contains(new Usuario("Gustavo"));
        System.out.println(resultado); 
        /*  caso falhe o hashcode, 
        o equals nao vai conseguir comparar logo resultado sera false

        caso o hashcode for setado igual para todos obj, o resultado sera true
        */
    }
    
}
