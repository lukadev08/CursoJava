package jbdc;

public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        //pode passar outros parametros do bd = (nome, codigo)
        System.out.println(dao.incluir(sql, "Roberto Marinho"));
        System.out.println(dao.incluir(sql, "Ana Maria"));
        System.out.println(dao.incluir(sql, "Jose Louro"));

        dao.close();
    }
}
