
//「データベースとの接続・クローズ処理」は別のクラスとして独立させることで、どのSQLを実行するときでも利用できるようにします。

package dbSample.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

	private static Connection con;

	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		con = DriverManager.getConnection("jdbc:mysql://localhost/world?useSSL=false&allowPublicKeyRetrieval=true",
				"root",
				"password"
				);

		return con;

	}

	public static void close() {

		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
