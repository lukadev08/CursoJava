package OOComposicao.Encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Jao", "da Silva", -20);
       // p1.idade = -300; metodo private nao expoe o atributo, logo nao se acessa
        p1.setIdade(-233); // possibilita alterar o valor do metodo

        System.out.println(p1.getIdade()); // get valor idade
        System.out.println(p1); // met. toString
        System.out.println(p1.getNomeCompleto()); 
    }
}
