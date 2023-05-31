package animal;

public class Animal {

	private int age;
	private String name;

	public Animal() {

	}

	public Animal(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public void say() {
		System.out.println( name + "です。" + age + "歳です。");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
