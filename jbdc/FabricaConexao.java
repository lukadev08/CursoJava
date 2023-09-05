package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
 
    public static Connection getConexao(){
        try {
            
            final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";//usa uma conexao segura sem certificar as credenciais do host(bd)
            final String usuario = "root";
            final String senha = "134340"; //sensitive data
    
            return DriverManager 
                .getConnection(url, usuario, senha);
        } catch (SQLException e) { //exception tipo sql
            throw new RuntimeException(e);
        }
    }
}
