package jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe o codigo a excluir: ");
        int codigo = entrada.nextInt();
        
        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo > ?";
        //pode usar uma condicao "= ou > ou <" pra excluir diversos registros

        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, codigo);

        int contador = statement.executeUpdate();

        //statement com comando de update
        if(contador > 0){
            System.out.println("Exclusao bem sucedida");
        } else{
            System.out.println("Nao houve operacao");
        }
        
        System.out.println("Linhas afetadas " + contador);
        
        conexao.close();
        entrada.close();
    }
}
