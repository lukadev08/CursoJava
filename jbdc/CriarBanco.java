package jbdc;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {
        // final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";//usa uma conexao segura sem certificar as credenciais do host(bd)
        // final String usuario = "root";
        // final String senha = "134340"; //sensitive data

        // //metodo pra conectar ao bd
        // Connection conexao = DriverManager //sempre retorna uma excecao a se tratar
        //     .getConnection(url, usuario, senha);

        Connection conexao = FabricaConexao.getConexao(); 
        //classe projetada para conectar ao banco
        
        Statement statement = conexao.createStatement(); //a partir dele pode executar o comando no banco de dados
        statement.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Banco criado com sucesso");

        conexao.close();
    
    }
}
