package l06.c04.s01;

public abstract class AbstractEmployee {

	/*抽象クラスは、中身のないメソッド（抽象メソッド）を持つクラスとなり、実体が存在しません。そのため、抽象クラスをインスタンス化することはできません。*/

    private String employeeName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public abstract void greeting();

	/*スーパークラス側ではメソッドの詳細は記述せず、サブクラスの方で実際に何をやるかを記述します。*/


}
