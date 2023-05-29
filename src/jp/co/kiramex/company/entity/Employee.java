package jp.co.kiramex.company.entity;

public class Employee {

	/*Javaでのプログラミングにおいて、データを保持するフィールド部分は private にしておき、外部から容易にアクセス・操作できないようにするのが、お作法です。
	 * その代わり、手続きを通してデータへアクセスすることとなりますが、その手続きの手法として getter/setter があります。
	 */
	private String employeeName;
	private String divisionName;
	private int vitality;

	public Employee() {
	}

	public Employee(String employeeName, String divisionName, int vitality) {
		System.out.println("初期化時に引数ありコンストラクタが呼ばれました");
		this.employeeName = employeeName;
		this.divisionName = divisionName;
		this.vitality = vitality;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

	/*慣習として、上記のようにgetterの名前はget + フィールド名、setterメソッドの名前はset + フィールド名とします。フィールドがboolean型の場合のみ、getterの名前をis + フィールド名とします。
	 * getter/setterは、STS（Eclipse）の機能（STS（Eclipse）のメニューバーから「ソース」→「getterおよびsetterの生成」）を使って自動生成すると比較的楽にコーディングできます。
	 * getter/setterの命名規則において、getterの名前はget + フィールド名、setterメソッドの名前はset + フィールド名で定義することは上記で学びました。
	 * このとき、get/setを除き、先頭文字を小文字にしたものをプロパティとよびます。*/
}
