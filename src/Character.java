
public class Character {

	public String name;
	public int hp;
	public int offense;
	public int defense;

	public Character() {

	}

	public Character(String name, int hp, int offense, int defense) {
		this.name = name;
		this.hp = hp;
		this.offense = offense;
		this.defense = defense;
	}


	/*opponent - new character class with fields where you put in the information from main() method*/
	public void attack(Character opponent) {

		int damage = this.offense - opponent.defense;
		if(damage > 0) {
			opponent.hp = opponent.hp - damage;
			System.out.println(this.name + " は " + opponent.name + "　に " + damage + " のダメージを与えた！");
		} else {
		 System.out.println("ミス！ " + this.name + " は " + opponent.name + " にダメージを与えられない！");
		}

	}

	public void showHP() {
		if (hp <= 0) {
			System.out.println("勇者が死んだ！");
		} else {
			System.out.println("勇者のHPは" + hp + "です。");
		}
	}

}
