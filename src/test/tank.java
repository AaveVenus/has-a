package test;

public class tank extends hero {
	public tank(int level, String nama) {
		this.healthPoint = 7000 + (200 * level);
		this.defense = 500 + (15 * level);
		this.attackDamage = 500 + (20 * level);
		this.level = level;
		this.name = nama;
		this.lifeStatus = true;
	}
	
	public void spawnIntro() {
		System.out.println("Bunuhlah saya");
	}
}
