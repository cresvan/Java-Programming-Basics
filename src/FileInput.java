import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileInput {

	public static void main(String[] args) {
		try {

            InputStream is = new FileInputStream("test.txt");	//で test.txt を読み込みモードで開き、


            BufferedReader reader = new BufferedReader(new InputStreamReader(is));	//で読み込み操作を行うオブジェクトを取得します。


            String str = reader.readLine();


            while(str != null) {
                System.out.println(str);
                str = reader.readLine();
            }

            /*あとは reader.readLine() で test.txt から1行ずつ文字列の取得を試みて、中身が空っぽ（null）でなければ文字列を表示する、という流れです。
             * 最後に、開いたファイルは閉じるようにしましょう。*/

            reader.close();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

		/*コード内にある try および catch というブロックは総称して 例外処理 と言います。
		 * 例外処理を入れているのは、ファイルがない( FileNotFoundException )場合やファイルへ正常に書き込めないトラブル( IOException )の場合でもプログラムが止まらないようにするためです。*/

    }
}



