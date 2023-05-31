package jp.co.kiramex.company.entity;

public interface MagicAttack {
	public abstract void magic_attack(Character opponent);

	/*public abstract void magic_attack(Character opponent); と書くことで、
	 * MagicAttack を implements するクラスに魔法攻撃（magic_attack() メソッド）の実装を強制させるようにします。*/

}
