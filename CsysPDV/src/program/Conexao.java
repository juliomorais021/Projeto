package program;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {
//fazendo conexão com o banco de dados
//criando um método
 
	public static  Connection fazendo_conexao() throws SQLException
	{
		//usando o try catch para tratar com erros de conexão caso exista.
		try {
			// pedindo para classe carregar o drive do mysql usado.
			Class.forName("com.mysql.jdbc.Driver");
			//criando a conexão com banco de dados e especificando onde esta o banco de dados
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/csyspdv", "root","");
			
		} catch (ClassNotFoundException e) {
		  throw new SQLException(e.getException());
		}
		
	}
	
	
	public static  boolean contem_usuario(String login , String  senha) 
	{
		//criando um  metodo  para buscar no db e verificar se os dados que o usuario colocou esta correto.
		
		try {	
			//unsado a função connection fazendo_conexao para conectar com o db e executar o  comando select
			Connection cn = Conexao.fazendo_conexao();
			//criando uma variavel com o nome "stmt" que vai receber o comando select.
			PreparedStatement stmt = cn.prepareStatement("SELECT * FROM usuarios WHERE login=? and senha=?");
			//setString para apontar qual vai ser buscado e verificado no db. no caso ele  pega o 1 que equivale a login no db e armazena na variavel que passei como parametro do metodo e o 2 para senha
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
