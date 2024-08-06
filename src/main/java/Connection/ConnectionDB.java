package Connection;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	private  String url = "jdbc:oracle:thin:@localhost:1521:orcl1";
	private String user= "System";
	private String pass = "1";
	private Connection connection = null;


	public Connection openConnect() throws SQLException {
		this.connection = DriverManager.getConnection(this.url, this.user, this.pass);
		return this.connection;
	}

	public void closeConnect() throws SQLException {
		if (this.connection != null) {
			this.connection.close();
		}

	}

	public Connection getConnect() {
		return this.connection;
	}
}
