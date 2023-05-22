
public class CastSample {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;

		System.out.println(a/b);
		System.out.println((double)a/b);
		System.out.println((double) (a/b));
		System.out.println((double)a/(double)b);

		/* １０行目のように3 / 2の割り算全体を double にキャストしようとするのはやめましょう。
		 * 整数と整数の商である 1 に対してキャストを行うので、小数値に変換されて 1.0 と表示されてしまうからです。計算式ではなくデータ（変数）に対してキャストをつけてください。
		 */

	}

}
