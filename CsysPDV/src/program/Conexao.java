package program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;


public class Conexao {
	

//fazendo conexão com o banco de dados
//criando um método

	public static Connection fazendo_conexao() throws SQLException {
		// usando o try catch para tratar com erros de conexão caso exista.
		try {
			// pedindo para classe carregar o drive do mysql usado.
			Class.forName("com.mysql.jdbc.Driver");
			// criando a conexão com banco de dados e especificando onde esta o banco de
			// dados
			System.out.println("funcionou");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/csyspdv", "root", "");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

	}
    public static void del(int id,boolean todos) {
    	
    	String Infdel = "DELETE FROM mercadoria WHERE id_mercadoria =?";
    	if(todos){
    		Infdel = "TRUNCATE mercadoria";
    	}
    	
    	try {
    		Connection connection = Conexao.fazendo_conexao();
            PreparedStatement statement = connection.prepareStatement(Infdel);
                     
            if(todos) statement.setInt(1, id);          

            statement.executeUpdate();
            connection.close();
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}
    }
	
	
	
	public static void add(String mercadoria, double valor, int quantidade) {

        String dados = "INSERT INTO mercadoria (nome_mercadoria, valor_mercadoria, qtn_mercadoria) VALUES ('?','?','?')";
        try {

            Connection connection = Conexao.fazendo_conexao();
            PreparedStatement statement = connection.prepareStatement(dados);

            statement.setString(1, mercadoria);           
            statement.setDouble(2, valor);         
            statement.setInt(3, quantidade);          

            statement.executeUpdate();
            connection.close();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
}

	

	public static boolean contem_usuario(String login, String senha) {
		// criando um metodo para buscar no db e verificar se os dados que o usuario
		// colocou esta correto.

		try {
			// unsado a função connection fazendo_conexao para conectar com o db e executar
			// o comando select
			Connection cn = Conexao.fazendo_conexao();
			// criando uma variavel com o nome "stmt" que vai receber o comando select.
			PreparedStatement stmt = cn.prepareStatement("SELECT * FROM usuarios WHERE login=? and senha=?");
			// setString para apontar qual vai ser buscado e verificado no db. no caso ele
			// pega o 1 que equivale a login no db e armazena na variavel que passei como
			// parametro do metodo e o 2 para senha
			stmt.setString(1, login);
			stmt.setString(2, senha);
			boolean existe = stmt.executeQuery().next();

			cn.close();
			return existe;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}