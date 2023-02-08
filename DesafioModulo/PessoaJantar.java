package DesafioModulo;

public class PessoaJantar {
    
    String nome;
    double peso;

    PessoaJantar(){

    }

    PessoaJantar(String nomePessoa, double pesoPessoa){
        this.nome = nomePessoa;
        this.peso = pesoPessoa;
        //atualizado:this.
      
    }
    //atualizado \/
    void comer(ComidaJantar comida){
        if(comida != null) {
            this.peso += comida.peso;
            //se comida nao for nulo = pessoa come e engorda
        }
    }

    String apresentar(){
        return "Eu sou o " + nome + " e tenho " + peso + " Kgs."; // forma de mostrar os resultados
    }
    
}
