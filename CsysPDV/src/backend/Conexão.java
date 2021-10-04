package backend;

public class Conexão {

	public static  void  Add() {

        Statement stmt1 = null;
        String dados = "insert into mercadoria "+" (nome_mercadoria,valor_mercadoria,qtn_mercadoria)"+" values ('S','2','3')";

        try {

            Connection cn = Conexao.fazendo_conexao();
            stmt1 = cn.createStatement();
            stmt1.executeUpdate(dados);
        } catch (Exception e) {
            // TODO: handle exception
        }

    };

}
