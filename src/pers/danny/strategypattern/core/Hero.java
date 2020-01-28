package pers.danny.strategypattern.core;

public class Hero {
	private String name; // 姓名
	private int hp = 500; // 血量
	private int mp = 200; // 魔力
	private int Strength = 150; // 力量
	private int wisdom = 80; // 智力
	private int defense = 50; // 防禦
	private Skill skill;

	public enum Skill {
		COLLIDING, WATERBALL;
	}

	public Hero(String name, Skill skill) {
		this.name = name;
		this.skill = skill;
	}

	public void attack(Hero targetHero) {
		switch (skill) {
		case COLLIDING:
			System.out.println(this.name + "使用了 衝撞攻擊。");
			targetHero.lostHp(getStrength() - targetHero.getDefense());
			break;
		case WATERBALL:
			System.out.println(this.name + "使用了 水球攻擊。");
			lostMp(5);
			targetHero.lostHp(getWisdom() * 2);
			break;
		}
	}

	private void lostHp(int i) {
		// TODO Auto-generated method stub
		this.setHp(this.getHp() - i);
	}

	private void lostMp(int i) {
		// TODO Auto-generated method stub
		this.setMp(this.getMp() - i);
	}

	private int getWisdom() {
		// TODO Auto-generated method stub
		return this.wisdom;
	}

	private int getDefense() {
		// TODO Auto-generated method stub
		return this.defense;
	}

	private int getStrength() {
		// TODO Auto-generated method stub
		return this.Strength;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		// TODO Auto-generated method stub
		return this.hp > 0;
	}

}
