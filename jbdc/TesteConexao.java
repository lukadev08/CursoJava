package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        
        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";//usa uma conexao segura sem certificar as credenciais do host(bd)
        final String usuario = "root";
        final String senha = "134340"; //sensitive data

        //metodo pra conectar ao bd
        Connection conexao = DriverManager //sempre retorna uma excecao a se tratar
            .getConnection(url, usuario, senha);

            System.out.println("Conexao bem sucedida");
        conexao.close();
    }
}


//nota: importar a lib de conexao mysql e add na config classpath/libraries