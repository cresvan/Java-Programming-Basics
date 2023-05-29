
public class Employee {

	public String employeeName;
	public String divisionName;
	public int vitality;

	/*コンストラクタ名は、クラス名と同じにする
	戻り値は記述しない（voidも書かない）
	仮にvoidと書くと通常のメソッドとして見なされ、コンパイルエラーも発生しないため、注意しましょう*/

	public Employee() {
        this("未設定です");
        System.out.println("引数なしコンストラクタを終了しました");
    }

	/*this()は、各コンストラクタの先頭行に書かないとコンパイルエラーになりますので、注意してください。
	 * 呼び出された引数なしコンストラクタ内の先頭行には、this("未設定です");があります。
	 * this()は、同じソースコード内にあるコンストラクタが呼び出されることを指定しています。これにより、String型引数1つがあるコンストラクタが呼び出されます。*/

    public Employee(String employeeName) {
        this(employeeName, "営業部");
        System.out.println("String型引数1つがあるコンストラクタを終了しました");
    }

    /*さらに、呼び出されたString型引数1つあるコンストラクタ内の先頭行には、this(employeeName,"営業部");があり、これによりString型引数2つがあるコンストラクタが呼び出されます。*/

    public Employee(String employeeName, String divisionName) {
        this(employeeName, divisionName, 150);
        System.out.println("String型引数2つがあるコンストラクタを終了しました");
    }


	public Employee(String employeeName, String divisionName, int vitality) {
		System.out.println("インスタンス化時に引数ありコンストラクタが呼ばれました");
		this.employeeName = employeeName;
		this.divisionName = divisionName;
		this.vitality = vitality;
	}

	/*フィールドの名前がemployeeName（左辺）で引数の名前もemployeeName（右辺）ですね。であると、どちらがどちらか見分けがつかなくなってしまいます。
	 * そこでthis.（これの）とつけることで、フィールドの方のemployeeNameであることを明示しています。this.つけていない場合、引数の方のemployeeName を使用することになります。
	したがって、this.を明示的に指定し、フィールドのemployeeNameに値を代入するという指定ができるようになります。
	どちらかの名前を変えても問題はありませんが、名前は揃えておいた方がよいとされています。
	コンストラクタも、メソッドの一種 なので、オーバーロードにより複数のコンストラクタが定義できることになります。
	これまで紹介したサンプルでも、引数なしのコンストラクタと引数が3つあるコンストラクタと2つ定義できていたことを確認しておきましょう。これもオーバーロードです。
	*/

	public void introduce() {
		System.out.println("私の名前は" + employeeName + "です。");
		System.out.println("所属部署は" + divisionName + "です。");
	}

	public void greeting() {
		vitality = vitality - 10;
		System.out.println("おはようございます");
	}

	public void report() {
		vitality = vitality - 10;
		System.out.println("今日は10件アポイント取りました");
	}

	public void showVitality() {
		vitality = vitality -10;
		System.out.println("残り体力は" + vitality);
	}

	public void goToWork() {

	}

	public void leaveWork() {

	}

}
