package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {
	
	public Connection conectaBD() {
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/cliente?user=root&password=mysql";
			conn = DriverManager.getConnection(url);
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro na classe de conexão DAO" + erro.getMessage());
		}
		return conn;
	}

}
