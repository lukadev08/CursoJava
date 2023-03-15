package OOComposicao.Encapsulamento;

public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(String nome, String sobrenome, int idade){
        setNome(nome);
        setIdade(idade);
        setSobrenome(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }


    public Pessoa (int idade) {
  //      this.idade = idade; // construtor que possibilita acesso ao metodo
        setIdade(idade);
    }

    // metodo getter
    public int getIdade(){ // metodo de acesso na classe main
        return idade;
    }

    // metodo set
    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade); // valor sempre sera positivo
        if(novaIdade >= 0 && novaIdade <= 120){ // loop limita o escopo da idade
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Mi nombre es " + getNome() + " y tengo " + getIdade() + " anos!" ;
    }
}
