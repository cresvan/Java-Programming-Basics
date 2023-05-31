package l06.c03.s05;

import l06.c03.s04.EmployeeBase;

public class EmployeeSales extends EmployeeBase {

	private String appointment;

	public EmployeeSales() {

	}

	public EmployeeSales(int employeeId, String employeeName, int vitality) {
		super(employeeId, employeeName, "営業部", vitality);
        this.appointment = "未定";
	}

	/*super はスーパークラスのメソッドを明示するためのものです。this と書くと自分のクラスのフィールドやメソッドを明示して操作できます。
	 * super = スーパー、this = 自分（この場合サブクラス）とおぼえておきましょう。これも繰り返し利用します。*/

	public void report() {
		super.setVitality(super.getVitality() - 10);
		System.out.println("今日は１０件アポイント取りました");
	}

	@Override

	public void introduce() {
		super.setVitality(super.getVitality() - 10);
		System.out.println("私の名前は" + super.getEmployeeName() + "です。");
		System.out.println("所属部署は" + super.getDivisionName() + "です。");
		System.out.println("今日のアポイント先は" + appointment + "です。");
	}

	@Override

	public void greeting() {
		super.setVitality(getVitality() - 10);
		System.out.println(super.getDivisionName() + "の皆さん" + "おはようございます");
	}

	/* @Override アノテーションを付与する必要はありませんが、記載しておくことで、他の人がコードを読む際に
	 * 「このメソッドはオーバーライドしているのか」というのがわかりやすくなることに加え、ちょっとしたシグネチャの記述ミスをeclipseが教えてくれるという利点があります。*/

	public String getAppointment() {
		return appointment;
	}

	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}

	public void showEmployeeId() {
		System.out.println(super.getEmployeeId());
	}


}
