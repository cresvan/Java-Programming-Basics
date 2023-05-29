import java.util.HashMap;

public class HasMapSample {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();


        hm.put("GK", "中村");
        hm.put("DF", "岩波");
        hm.put("MF", "南野");
        hm.put("FW", "浅野");


        String member = hm.get("FW");
        System.out.println(member);


        int size = hm.size();
        System.out.println(size);


        for (String key : hm.keySet()) {
            System.out.println(key + ":" + hm.get(key));
        }

        /*入れたのはGKからでしたが、果たしてその順番どおり出力されたでしょうか？おそらくされていないはずです（たまたま完全に順番どおりとなる場合もあります）。
         * これは、HashMapはあくまでKeyとValueの集合であり、その並び順は保障されていないからです。これも特徴のひとつです。*/

    }

}
