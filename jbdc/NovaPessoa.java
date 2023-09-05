package jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();

        Connection conexao = FabricaConexao.getConexao();

        //String sql = "INSERT INTO pessoas (nome) VALUES ('" + nome + "')";
        //cuidado com sql inject = facil de manipular

        String sql = "INSERT INTO pessoas (nome) VALUES (?)"; // -> ?, ? (nome, codigo) = parametros a preencher na tabela
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, nome);   //metodo seguro, garante q o comando sera uma string e nao um sql
        
        //statement.setInt(2, 100); //seta um id no sql manualmente; pode baguncar a tabela forcando um novo indice numeral a ser contado


        statement.execute();
        System.out.println("Pessoa incluida com sucesso");
        
        entrada.close();
        
    }
}
