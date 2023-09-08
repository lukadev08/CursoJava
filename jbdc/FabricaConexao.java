package jbdc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
 
    public static Connection getConexao(){
        try {
            Properties prop = getProperties();
            final String url = prop.getProperty("banco.url"); //usa uma conexao segura sem certificar as credenciais do host(bd)
            final String usuario = prop.getProperty("banco.usuario");
            final String senha = prop.getProperty("banco.senha");
            //utiliza propriedades externas ao arquivo pra acesssar o BD = .properties
            // bom fazer o .properties fora do pacote do app = em uma pasta user etc
            
            return DriverManager 
                .getConnection(url, usuario, senha);
        } catch (SQLException | IOException e) { //exception tipo sql
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException{
        Properties prop = new Properties();
        String caminho = "/conexao.properties";
        prop.load(FabricaConexao.class.getResourceAsStream(caminho));
        return prop;
    }
}
