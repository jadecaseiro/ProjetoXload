package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
	public Connection con;
	public Statement stm;

	public Statement conectar() throws Exception {
		try {
			// con =
			// DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","111110");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/projetoXload", "admin", "111110");
			stm = con.createStatement();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao conectar ao banco de dados: "
					+ sqle.getMessage());
		}
		return stm;
	}

	public void desconectar() {
		try {
			con.close();

		} catch (SQLException sqle) {

		}
	}

}
