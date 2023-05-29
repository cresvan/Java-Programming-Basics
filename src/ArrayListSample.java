import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
        al.add("アイスランド");
        al.add("スペイン");
        al.add("ナポリ");
        al.add("リスボン");
        al.add("ヨセミテ国立公園");


        String place = al.get(2);
        System.out.println(place);


        int listCount = al.size();
        System.out.println(listCount);


        al.remove(2);
        place = al.get(2);
        System.out.println(place);

        System.out.println("ループここから");


        for(String nation : al){
            System.out.println(nation);
        }

        /*ArrayListを作成して、そこに要素を1つずつ追加していきました。追加はaddというメソッドがあります。指定した添字（○番目）のデータを取得するメソッドはgetです。
         * これもくどいようですが、ゼロ番目からのスタートなので、実行すると「ナポリ」が表示されます。
         * 次にsizeというメソッドで要素数を数えます。このsizeメソッドの戻り値はintです。そのあとで削除をしています。
         * removeメソッドを用いました。出力のとおり、1つ無くなってずれたことで、get(2)で「リスボン」が表示されます。最後は拡張for文で全部出力してみる、というコードになっています。*/
    }
}