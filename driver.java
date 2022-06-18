package kegiatan2;

public class driver {
	public static void main(String[] args) {
		pembuat author = new pembuat("Karl Rapp, Gustav Otto, Camillo Castiglioni, Franz Josef Popp","7 Maret 1916","Munchen, Jerman");
		motor bmwmotor = new motor("BMW HP4 Race","Rp 2.1M","999 cc","205 HP","Sport",author);
		mobil bmwmobil = new mobil("BMW SERI 5","Rp 1.0007M","1998 cc","184 HP","Sedan",author);
		System.out.println("BWM atau Bayerische Motoren Werke");
		bmwmobil.author.display();
		bmwmobil.keluar();
		bmwmotor.metu();
	}
}