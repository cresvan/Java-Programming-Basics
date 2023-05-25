
public class Boolean01 {

	public static void main(String[] args) {
		int score1 = 70;

		if (!(score1 < 60)) {
			System.out.println("あなたの点数は" + score1  + "です。\n合格です！\n");
		} else {
			System.out.println("あなたの点数は" + score1  + "です。\n赤点です...\n");
		}

			/*点数が60点 未満ではない 、つまり、点数が60点以上のときに「合格です！」と表示されます。もちろん、「未満ではない」は「以上」と同じなので、
			 * score >= 60 と書いても良いのですが、こういう書き方もできるということは覚えておいてください。
			 */


		int score2 = 80;

		if (score2 == 100) {
			System.out.println("あなたの点数は" + score2  + "です。\n満点です！ご褒美を上げます！\n");
		} else if (score2 >= 80) {
			System.out.println("あなたの点数は" + score2  + "です。\nよくできました！\n");
		} else if (score2 >= 60) {
			System.out.println("あなたの点数は" + score2  + "です。\n合格です！\n");
		} else {
			System.out.println("あなたの点数は" + score2  + "です。\n赤点です...補講を行います。\n");
		}



		int score3 = 59;

		if (score3 == 100) {
			System.out.println("あなたの点数は" + score3  + "です。\n満点です！ご褒美を上げます！\n");
		} else if (score3 >= 80 && score3 <=99) {
			System.out.println("あなたの点数は" + score3  + "です。\nよくできました！\n");
		} else if (score3 >=60 && score3 <=79) {
			System.out.println("あなたの点数は" + score3  + "です。\n合格です！\n");
		} else {
			System.out.println("あなたの点数は" + score3  + "です。\n赤点です...補講を行います。\n");
		}


		int scoreSansu = 80;
        int scoreKokugo = 80;

        if (scoreSansu >= 60 && scoreKokugo >= 60) {
            System.out.println("合格してます！\n");
        } else if (scoreSansu >= 60 || scoreKokugo >= 60) {
            System.out.println("算数か国語どちらかが補講対象です\n");
        } else {
            System.out.println("赤点です...補講を行います\n");
        }

	}

}
