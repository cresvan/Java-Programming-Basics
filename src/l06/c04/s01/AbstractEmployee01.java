package l06.c04.s01;

public class AbstractEmployee01 {

	public static void main(String[] args) {
		 EmployeeGeneral emp01 = new EmployeeGeneral();
		 EmployeeSystem emp02 = new EmployeeSystem();

		 emp01.greeting();
		 emp02.greeting();

	}

	/*抽象クラス内に宣言されたフィールドなどはどのようにして利用するのでしょうか。
	 * それは、抽象クラスを継承したサブクラスを作り、そのサブクラス内で抽象メソッド内の実装を行わせることになります。つまり、継承時にオーバーライドを強制することになります。*/

}
