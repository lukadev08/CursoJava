package jbdc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas";

        Statement statement = conexao.createStatement();
        ResultSet resultado = statement.executeQuery(sql);
        //interface para obter informacoes do BD para o editor/app

        List<Pessoa> pessoas = new ArrayList<>();
        //armazena a lista de pessoas no app => terminal

        while(resultado.next()){ //loop q executa o select ate o fim da consulta com identificadores
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for(Pessoa p: pessoas){
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }

        statement.close();
        conexao.close();
    }
}
 