
public class ForSample2 {

	public static void main(String[] args) {
		for (int u = 0; u <=20; u++) {
			if (u % 2 == 0) {
				System.out.println("u = " + u);
			}
		}

	}
}


/* for文のカウンタ変数を配列の添え字に利用する
 * 配列の添え字（インデックス）にfor文のカウンタ変数を利用することが多くあります。
 * 配列の添え字は0からスタートし、要素数-１の値まで順番にあるため、for文のカウンタ変数にて、順番にカウントアップさせると、配列の全要素を順番に利用することが可能となるわけです。
 *
 * int [] array = {10,20,30,40,50};
   for(int i = 0; i < array.length; i++){
       // array[i]のように添え字にカウンタ変数が利用できる
   }
 *
 * */
