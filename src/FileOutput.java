import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileOutput {

	public static void main(String[] args) {
		try {

            OutputStream os = new FileOutputStream("test.txt", true); 	//ここでファイルを開きました。

            /*第2引数を true にすると、プログラムが「追記モード」でファイルを開いてくれるので、すでに保存されている内容の末尾に追記される形となります。
             * 指定のテキストファイルが存在していない場合は新規作成されます。第2引数が false の場合は「書き込みモード」となり、すでに保存されている内容が上書き（消去）されてしまいます。*/

            OutputStreamWriter writer = new OutputStreamWriter(os);		//ファイルへの書き込み操作を行うオブジェクトを生成します。

            writer.write("ファイルへ書き込みます。\n");

            /*writer.write() で書き込み（追記）を実行します。引数に指定した文字列が保存されます（\n は改行記号です）。*/

            writer.close();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

		/*最後にお作法として writer と os のオブジェクト2つをそれぞれ close() により破棄して、ファイルを閉じます。開いたファイルは開きっぱなしにせず、自分で閉じましょう。
		 * この FileOutput を実行すると、プロジェクト内に test.txt が作成されます。（パッケージ・エクスプローラー内に表示されない場合は「プロジェクト名を右クリック→リフレッシュ」で表示内容を更新してください）。
		 * また、FileOutput を1回実行するごとに「ファイルへ書き込みます」と書かれた行が増えていきますので、実行確認してみてください。*/
    }
}