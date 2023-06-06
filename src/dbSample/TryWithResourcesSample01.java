
//以下のサンプルコードは、これまで記述してきたデータベースアクセスプログラムをtry-with-resources構文を用いて記述したものです。

package dbSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResourcesSample01 {

  public static void main(String[] args) {
    try {

      Class.forName("com.mysql.cj.jdbc.Driver");

      String sql = "SELECT * FROM country LIMIT 50";

      //try-with-resources構文
      try (
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/world?useSSL=false&allowPublicKeyRetrieval=true",
            "root",
            "password");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(sql);) {

    	//この try（ から ） までで宣言された変数は、tryブロック内がスコープとなり、tryブロックの処理が終了すると、AutoCloseableインターフェイスにより自動的に閉じられることになります。


        while (rs.next()) {

          String name = rs.getString("Name");

          System.out.println(name);
        }
      }

    } catch (ClassNotFoundException e) {
      System.err.println("JDBCドライバのロードに失敗しました。");
      e.printStackTrace();
    } catch (SQLException e) {
      System.err.println("データベースに異常が発生しました。");
      e.printStackTrace();
    }
  }

}