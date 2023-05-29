package jp.co.kiramex.company.entity;

public class GetterSetterSample {

	public static void main(String[] args) {
		/*
		Employee employee = new Employee();
		employee.employeeName = "大島";
		*/

		/*privateは自分のクラスでしか操作できないので、別のクラスである GetterSetterSample.java からは操作できません。
		 * そのため、上記だとコンパイルエラーのメッセージが出てきます。もちろんprivateを消すと警告は消えますが、カプセル化のお作法でなくなります。
		 */

		Employee employee = new Employee();

		employee.setEmployeeName("大島");

		String empName = employee.getEmployeeName();
		System.out.println(empName);

		/*ここで大事なことは、データだけ持たせるクラスと、操作・設定するクラスを完全に別にすることです。*/


	}

}
