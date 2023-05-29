package jp.co.kiramex.company.entity;

public class RPG {

	public static void main(String[] args) {

		Character hero = new Character("勇者", 10, 5, 3);
		Character slime = new Character("スライム", 5, 2, 2);
		Character maou = new Character("魔王", 29500, 160, 210);

		hero.attack(slime);
		hero.attack(maou);
		slime.attack(hero);
		maou.attack(hero);
		hero.showHP();
	}

}
