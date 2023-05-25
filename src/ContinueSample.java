
public class ContinueSample {

	public static void main(String[] args) {
		int[] targetArray = { 37, 85, 64, 57, 98, 100, 47, 23, 71, 69 };

        int count = 0;

      /*:（コロン）の前にあるデータ型 変数名 … 各要素から取り出したデータの変数を宣言
		:（コロン）の後にある配列名またはコレクション名 … 操作対象の配列またはコレクションを指定*/
        for (int value : targetArray) {
            if (value < 60) {

      /*continueは残りのコードをスキップして、ループの先頭に戻ってを続けるための仕組みです。*/
                continue;
            }

      /*else{}はなくてもいい（？）*/
            else {count++;}
        }

        System.out.println("60点以上の人は、" + count + "人です。");

	}

}
