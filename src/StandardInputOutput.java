import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardInputOutput {

	public static void main(String[] args) {
		try {


            BufferedReader key = new BufferedReader(new InputStreamReader(System.in));


            System.out.println("何か文字を入力してください =>");

            /*今まで何度も記述してきた System.out.println("なんらかの文字列"); の処理のうち、 System.out は同じく System クラスのフィールドで、「標準出力」を表しています。*/

            String str = key.readLine();

            /*入力を読み取る際に使用している readLine() メソッドは改行を入力の終了とみなす為、エンターを押すと読み取りは終了します。
             * 複数行の入力を読み取りたい場合はループ処理と組みあわせて使用する必要があります。*/

            System.out.println("入力された文字列は「" + str + "」です。");

            /*キーボードから入力されたデータは、Stringとして受け取る必要があります。
             * 数値を入力してもらったとしても、Stringのままでは数値計算などへ利用できません。ラッパークラスのところで紹介した Integer.parseInt() などを使ってキャストしてください。*/


        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}