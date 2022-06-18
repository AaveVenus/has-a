package test;

public class mage extends hero implements MagicalDamage {
	public mage(int level, String nama) {
		this.healthPoint = 2500 + (85 * level);
		this.defense = 200 + (10 * level);
		this.attackDamage = 700 + (35 * level);
		this.level = level;
		this.name = nama;
		this.lifeStatus = true;
		this.attackDamage += attackDamage * magicbonusDamage;
	}
	
	public void spawnIntro() {
		System.out.println("Ezz dek");
	}
}