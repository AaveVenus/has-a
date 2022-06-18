package test;

public class assasin extends hero implements CriticalDamage {
	public assasin(int level, String nama) {
		this.healthPoint = 3000 + (90 * level);
		this.defense = 300 + (15 * level);
		this.attackDamage = 800 + (30 * level);
		this.level = level;
		this.name = nama;
		this.lifeStatus = true;
		this.attackDamage += attackDamage * bonusDamage;
	}
	
	public void spawnIntro() {
		System.out.println("Matilah kamu");
	}
}
