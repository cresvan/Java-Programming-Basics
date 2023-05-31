
public class ExceptionSample1 {

	public static void main(String[] args) {
		try {
			int[] targetArray = { 37, 85, 64, 57, 98, 100, 47, 23, 71, 69 };

			int search = 55;

			int i;

			for(i = 0; i<= targetArray.length; i++) {
				if (search == targetArray[i]) {
					break;
				}
			}

			if(i >= targetArray.length) {
				System.out.println("対象のデータが見つかりませんでした！");
			} else {
				System.out.println("添え字" + i + "に対象のデータが見つかりました！");
			}
		} catch(IndexOutOfBoundsException e) {
			System.err.println("配列の添え字が超えました。");
		} catch(ArithmeticException e) {
			System.err.println("0除算を行っています");
		}

		/*catchブロックの先頭に例外クラスのスーパークラスを記述してしまうとすべての例外オブジェクトであることになってしまうため（サブクラスのインスタンスは、
		 * スーパークラスの参照変数で参照することができる）、そのcatchブロックで対処されてしまいます。
		 * つまり、スーパークラス側を受け取るcatchブロックを記述したあと、サブクラス側の例外を受け取るcatchブロックを書いても到達することが一切ないことになります（コンパイルエラーが発生）。*/
	}

}
