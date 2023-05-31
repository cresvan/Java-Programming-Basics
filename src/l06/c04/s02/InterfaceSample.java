package l06.c04.s02;

public class InterfaceSample {

	public static void main(String[] args) {

		EmployeeSalesInterface emp01 = new EmployeeSalesInterface();
		EmployeeSystemInterface emp02 = new EmployeeSystemInterface();

		emp01.greeting();
		emp02.greeting();

	}

	/*クラスとインターフェイスの一番の違いは 多重継承 の可否です。多重継承は、複数の親を同時に継承することを言います。通常のクラスや抽象クラス (extends) では多重継承ができません。
	 * しかし、インターフェイスなら、複数のインターフェイスを同時に implements できます。ここに大きな違いがあります。
	 * なお、public class A extends B implements C { ... } のように書くことで、スーパークラスの継承とインターフェイスの実装を両方同時に指定できます。
	 * extendsをimplementsより先に書く必要がありますので、注意してください。*/

}
