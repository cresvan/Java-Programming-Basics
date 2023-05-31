package l06.c03.s04;

import jp.co.kiramex.company.entity.Character;
import jp.co.kiramex.company.entity.MagicAttack;

public class Hero extends Character implements MagicAttack {
	private int weapon;

	public int getWeapon() {
		return weapon;
	}

	public void setWeapon(int weapon) {
		this.weapon = weapon;
	}

	public Hero() {

	}

	public Hero(String name, int hp, int offense, int defense, int weapon) {
		super(name, hp, offense, defense);
		this.weapon = weapon;
	}

	/*引数ありのコンストラクタの中で super(name, hp, offense, defense); と記述することで、スーパークラスが持つ引数ありのコンストラクタを呼び出している点に注目してください。*/

	@Override

	public void attack(Character opponent) {

		int damage = super.getOffense() + this.getWeapon() - opponent.getDefense();

		if (damage > 0) {

			opponent.setHp(opponent.getHp() - damage);
			System.out.println(super.getName() + " は " + opponent.getName() + " に " + damage + " のダメージを与えた！");
		} else {
			System.out.println("ミス！ " + super.getName() + " は " + opponent.getName() + " にダメージを与えられない！");
		}
	}

	@Override
	public void magic_attack(Character opponent) {
		int damage = 5;
		opponent.setHp(opponent.getHp() - damage);
		System.out.println(this.getName() + " は魔法で" + opponent.getName() + " に " + damage + " のダメージを与えた！");
	}


}


