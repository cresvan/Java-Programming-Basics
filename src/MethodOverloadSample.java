
public class MethodOverloadSample {

	public static void main(String[] args) {

		add(10.2, 6.8);
		add(20, 30);
		add(10, 50, 40);

	}

	public static void add(int num1, int num2) {
		System.out.println("addition of 2 integers: " + (num1 +num2));
	}
	public static void add(int num1, int num2, int num3) {
		System.out.println("addition of 3 integers: " + (num1 +num2 + num3));
	}
	public static void add(double num1, double num2) {
		System.out.println("addition of 2 doubles: " + (num1 + num2));
	}

	/*メソッドのオーバーロードの仕組みを使うことで、（同じメソッド名でも）引数の数や型・順番に応じて異なる処理を実行できます*/


}
