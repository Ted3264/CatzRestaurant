package technical;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DBConnexion {
	private static final String DRIVER_POSTGRESQL = "postgresql";
	private static final String HOST_POSTGRESQL = "localhost";
	private static final String PORT_POSTGRESQL = "5432";
	private static final String DATABASE_POSTGRESQL = "hibernate";
	private static final String URL_POSTGRESQL = "jdbc:" + DRIVER_POSTGRESQL + "://" + HOST_POSTGRESQL + ":" + PORT_POSTGRESQL + "/" + DATABASE_POSTGRESQL;
	private static final String USER_POSTGRESQL = "postgres";
	private static final String PASSWORD_POSTGRESQL = "kikoo32768";
	//
	private static final String DRIVER_MYSQL = "mysql";
	private static final String HOST_MYSQL = "localhost";
	private static final String PORT_MYSQL = "3306";
	private static final String DATABASE_MYSQL = "hibernate";
	private static final String URL_MYSQL = "jdbc:" + DRIVER_MYSQL + "://" + HOST_MYSQL + ":" + PORT_MYSQL + "/" + DATABASE_MYSQL;
	private static final String USER_MYSQL = "root";
	private static final String PASSWORD_MYSQL = "1234512345";
	//
	private static Connection connection = null;
	public static String getUrl(boolean arg) {
		if (arg) return URL_POSTGRESQL;
		else return URL_MYSQL;
	}
	public static void main(String... args) {
		Connection conn = getInstance(true);
		try {
			System.out.println(conn.getMetaData().getURL());
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	public static Connection getInstance(boolean arg) {
		if (connection == null) try {
			Class.forName("org.postgresql.Driver");
			if (arg) connection = DriverManager.getConnection(URL_POSTGRESQL, USER_POSTGRESQL, PASSWORD_POSTGRESQL);
			else connection = DriverManager.getConnection(URL_MYSQL, USER_MYSQL, PASSWORD_MYSQL);
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
			Logger.getLogger(DBConnexion.class.getName()).log(Level.SEVERE, (String) null, ex);
			return null;
		}
		return connection;
	}
}