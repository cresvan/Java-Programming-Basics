package dbSample;

//Ctrl + Shift + O to import
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectSample01 {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			//ドライバのクラスをJava上で読み込む
			Class.forName("com.mysql.cj.jdbc.Driver");

			//DBと接続する
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/world?useSSL=false&allowPublicKeyRetrieval=true",
					"root",
					"password"
			);

			//DBとやりとりする窓口を用意する
			stmt = con.createStatement();

			//SQLを実行（Select文の実行と結果を格納／代入）
			String sql = "SELECT * FROM country LIMIT 50";		//DBViewerもしくは、コマンドプロンプトを開いてそのSQLが正しいか先に確認しておきましょう。
			rs = stmt.executeQuery(sql);

			//結果を表示する
			while( rs.next() ) {
				String name = rs.getString("Name");
				int population = rs.getInt("Population");

				System.out.println(name);
				System.out.println(population);
			}

			/*rs.next()メソッドとは、表の中にデータがあるかどうかを指し示すための処理です。
			 * 別の言い方をすると、DBから取り出してきたデータは何行であってもまとめて処理をすることはできず、1行ずつ処理することが必須となっています。
			 */




		} catch (ClassNotFoundException e) {
			System.err.println("JDBCドライバのロードに失敗しました。");
			e.printStackTrace();
		} catch (SQLException e) {
            System.err.println("データベースに異常が発生しました。");
            e.printStackTrace();
		}	finally {

			if ( rs != null ) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.err.println("ResultSetを閉じるときにエラーが発生しました。");
					e.printStackTrace();
				}
			}

			if( stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					System.err.println("Statementを閉じるときにエラーが発生しました。");
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.err.println("データベース切断時にエラーが発生しました。");
					e.printStackTrace();
				}
			}

		}

		/*この閉じる処理の順番は、後で接続（開いた）ものから、先に切断（閉じる）ようにしましょう。
		 * 繋いだ時とは逆順、Connectionそのものを一気に切るのではなく、ResultSet,Statement,Connectionの順で切るようにしてください。
		 */

	}

}
