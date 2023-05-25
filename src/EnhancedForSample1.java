
public class EnhancedForSample1 {

	public static void main(String[] args) {
		int [] scores = {47, 55, 88, 100, 74};
		int sum = 0;
		double average = 0.0;

		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}

		average = (double) sum / scores.length;

		System.out.println("合格点は、" + sum + "点、平均点は、" + average + "点です。");

		/*int[] scores = { 47, 55, 88, 100, 74 };
        int sum = 0;
        double average = 0.0;


        for (int data : scores) {
            sum = sum + data;
        }

        average = (double) sum / scores.length;

        System.out.println("合計点は、" + sum + "点、平均点は、" + average + "点です。");


        :（コロン）の前にあるデータ型 変数名 … 各要素から取り出したデータの変数を宣言
		:（コロン）の後にある配列名またはコレクション名 … 操作対象の配列またはコレクションを指定
        */
	}

}
