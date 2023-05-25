
public class SwitchSample {

	public static void main(String[] args) {
		int score = 100;

		int rank = score / 10;

		switch(rank) {
		case 0 :
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :
			System.out.println("あなたの点数は" + score  + "です。\n赤点です...補講を行います。\n");
			break;
		case 6 :
		case 7 :
			System.out.println("あなたの点数は" + score  + "です。\n合格です！\n");
			break;
		case 8 :
		case 9 :
			System.out.println("あなたの点数は" + score  + "です。\nよくできました！\n");
			break;
		case 10 :
			System.out.println("あなたの点数は" + score  + "です。\n満点です！ご褒美を上げます！\n");
			break;

			/*上記サンプルコードでは、scoreを10で割った値（整数）を利用し、ランクを判定しています。rankが0〜5（つまり、
			 * 0点から59点まで）のときは、赤点となり、rankが6と7（60点以上80点未満）のときは、合格、rankが8と9（80点以上100点未満）のとき、
			 * よくできました、rankが10（100点満点）のときは、満点ですとなります。
			このように、範囲を持たせたいときは、breakを記述せずに次のcaseの処理を行わせることも可能ですが、可読性は低くなります。*/
		}

	}

}
