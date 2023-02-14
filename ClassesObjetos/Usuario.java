package ClassesObjetos;

public class Usuario {
    
    String nome;
    String email;
   
    //metodo de comparacao Equals
    public boolean equals(Object objeto) { 
       
        if(objeto instanceof Usuario){

            Usuario outro = (Usuario) objeto;
            //converte Object ==> Usuario
            
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean nomeEmail = outro.email.equals(this.email);
            // criterio de comparacao == dos objetos
            
            return nomeIgual && nomeEmail;

        } else {

            return false;
        }
        /* 
        boolean nomeIgual = outro.nome == this.nome;
        boolean nomeEmail = outro.email == this.email;
            nao e a melhor pratica(==)
        */ 
       
    }
}
