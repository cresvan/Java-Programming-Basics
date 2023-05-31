package l06.c03.s04;

public class EmployeeSales extends EmployeeBase {

	private String appointment;

	public EmployeeSales() {

	}

	public EmployeeSales(int employeeId, String employeeName, int vitality) {
		super.setEmployeeId(employeeId);
        super.setEmployeeName(employeeName);
        super.setDivisionName("営業部");
        super.setVitality(vitality);
        this.appointment = "未定";
	}

	/*super はスーパークラスのメソッドを明示するためのものです。this と書くと自分のクラスのフィールドやメソッドを明示して操作できます。
	 * super = スーパー、this = 自分（この場合サブクラス）とおぼえておきましょう。これも繰り返し利用します。*/

	public void report() {
		super.setVitality(super.getVitality() - 10);
		System.out.println("今日は１０件アポイント取りました");
	}

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
