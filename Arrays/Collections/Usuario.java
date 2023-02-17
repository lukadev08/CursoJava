package Arrays.Collections;


public class Usuario {
    
    String nome;

    Usuario (String nome){
        this.nome = nome;
    }

    public String toString(){
        return "Mi nombre es " + this.nome + "."; 
        /* 
        na classe do metodo main o 'usuario' sera imprimido com este valor automaticamente
        */
    }

    /* 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
    */

    @Override
    public int hashCode() {
        //return 1; todos os hashcode dos usuarios serao 1

        return this.nome.length(); // seta o 'nome' como hashcode para parametro de comparacao
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
    
 //source action shortcut /\

/* 
 // apenas o hashcode mais simples
public int hashCode(){
    return 0;
}

 public boolean equals(Object obj){
    Usuario outroUsuario = (Usuario) obj;
    return this.nome.equals(outroUsuario.nome);

 }
  */
  
}
