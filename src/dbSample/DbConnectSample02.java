package dbSample;

//Ctrl + Shift + O to import
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectSample02 {

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
			 * 別の言い方をすると、DBから取り出してきたデータは何行であってもまとめて処理をすることはできず、1行ずつ処理することが必須となっています。*/

			sql = "update country set Population = 105000 where Code = 'ABW'";
            int count = stmt.executeUpdate(sql);
            System.out.println(count);

            /*更新系の処理です。executeUpdate()メソッドの引数内のSQL、つまりUPDATE文が実行されています。DBViewerで、更新がうまくいったかを重ねて確認しておいてください。
             * このメソッドを実行した時の戻り値は、「1」です。UPDATE文は1行しか変更をかけていないので「1」となります。つまり、この何行に変更があったか？の数値が戻り値になります。
             * 1でなければ正常に更新できていないと判断しましょう。*/


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
