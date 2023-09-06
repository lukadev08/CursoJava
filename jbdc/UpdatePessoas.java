package jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePessoas {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
       
        //bloco select atual
        System.out.println("Informe o codigo da pessoa: ");
        int codigo = entrada.nextInt();
        
       String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
       String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
       Connection conexao = FabricaConexao.getConexao();

       PreparedStatement statement = conexao.prepareStatement(select);
       statement.setInt(1, codigo);
       ResultSet r = statement.executeQuery();

       if(r.next()){
        Pessoa p = new Pessoa(r.getInt(1), r.getString(2));

        System.out.println("O nome atual: " + p.getNome());
        entrada.nextLine();
        
        System.out.print("Informe o novo nome:");
        String novoNome = entrada.nextLine();
        
        statement.close();
        //bloco select atual
        
        //bloco update
        statement = conexao.prepareStatement(update);
        statement.setString(1, novoNome);
        statement.setInt(2, codigo);
        statement.execute(); //nao precisa ser o query pois nao e uma consulta
        
        System.out.println("Cadastro alterado com sucesso");
        //bloco update

    } else {
        System.out.println("Cadastro nao encontrado");
    }   
    
        conexao.close();      
        entrada.close();
    }
}
