package pers.danny.strategypattern.core;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero1 = new Hero("¤p¤ý", Hero.Skill.COLLIDING);
		Hero hero2 = new Hero("¤p©ú", Hero.Skill.WATERBALL);

		Battle battle = new Battle(hero1, hero2);
		battle.start();
	}

}
