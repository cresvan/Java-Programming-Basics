package l06.c03.s04;

public class UseEmployeeSales {

	public static void main(String[] args) {

		EmployeeSales sales = new EmployeeSales(1135, "南野", 200);

		sales.setAppointment("ほげほげ商事株式会社");

		sales.introduce();

		sales.greeting();

		sales.report();

		sales.showVitality();

		sales.showEmployeeId();

	}

}
