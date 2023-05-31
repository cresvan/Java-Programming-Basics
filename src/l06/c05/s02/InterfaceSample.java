package l06.c05.s02;

public class InterfaceSample {

	public static void main(String[] args) {
		InterfaceEmployee emp01 = new EmployeeSalesInterface();
		InterfaceEmployee emp02 = new EmployeeSystemInterface();

		emp01.greeting();
		emp02.greeting();

		newGreeting(emp01);
		newGreeting(emp02);

	}

	static void newGreeting(InterfaceEmployee employee) {
		System.out.println("ポリモーフィズムです");
		employee.greeting();
	}

}
