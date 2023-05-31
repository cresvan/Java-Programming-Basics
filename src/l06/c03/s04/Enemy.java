package l06.c03.s04;

import jp.co.kiramex.company.entity.Character;

public class Enemy extends Character {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Enemy() {

	}

	public Enemy(String name, int hp, int offense, int defense, String type) {
		super(name, hp, offense, defense);
		this.type = type;
	}

	/*引数ありのコンストラクタの中で super(name, hp, offense, defense); と記述することで、スーパークラスが持つ引数ありのコンストラクタを呼び出している点に注目してください。*/

}
