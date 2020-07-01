package technical;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PostgreSQLConnexion {
	private static final String HOST = "localhost";
	private static final String PORT = "5432";
	private static final String DATABASE = "hibernate";
	private static final String URL = "jdbc:postgresql://" + HOST + ":" + PORT + "/" + DATABASE;
	public static String getUrl() { return URL; }
	private static final String USER = "postgres";
	private static final String PASSWORD = "postgres";
	private static Connection connection = null;
	public static void main(String... args) {
		Connection conn = getInstance();
		try {
			System.out.println(conn.getMetaData().getURL());
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	public static Connection getInstance() {
		if (connection == null) try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
			Logger.getLogger(PostgreSQLConnexion.class.getName()).log(Level.SEVERE, (String) null, ex);
			return null;
		}
		return connection;
	}
}