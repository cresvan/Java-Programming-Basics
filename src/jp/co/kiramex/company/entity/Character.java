package jp.co.kiramex.company.entity;

public class Character {

	private String name;
	private int hp;
	private int offense;
	private int defense;

	public Character() {

	}

	public Character(String name, int hp, int offense, int defense) {
		this.name = name;
		this.hp = hp;
		this.offense = offense;
		this.defense = defense;
	}

	public void attack(Character opponent) {

		int damage = this.offense - opponent.defense;
		if(damage > 0) {
			opponent.hp = opponent.hp - damage;
			System.out.println(this.name + " は " + opponent.name + "　に " + damage + " のダメージを与えた！");
		} else {
		 System.out.println("ミス！ " + this.name + " は " + opponent.name + " にダメージを与えられない！");
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getOffense() {
		return offense;
	}

	public void setOffense(int offense) {
		this.offense = offense;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public void showHP() {
		if (hp <= 0) {
			System.out.println("勇者が死んだ！");
		} else {
			System.out.println("勇者のHPは" + hp + "です。");
		}
	}

}