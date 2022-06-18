package BangunRuang;

import java.util.Scanner;

public class driver {

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
	}

	public static void main(String[] args) {
		double phi, r, s, t;
		int menu, a, b;

		kerucut kerucut = new kerucut();
		bola bola = new bola();
		Scanner masuk = new Scanner(System.in);

		System.out.println("Selamat Datang di Program Menghitung Luas Permukaan dan Volume Bangun Ruang");
		System.out.println("Silahkan Pilih Bangun Ruang");
		System.out.println("1. Kerucut");
		System.out.println("2. Bola");
		System.out.print("Pilihan : ");
		menu = masuk.nextInt();

		switch (menu) {
			case 1:
				clearScreen();
				System.out.println("Bangun Ruang Kerucut");
				System.out.println("Pilih yang akan dihitung!");
				System.out.println("1. Luas Permukaan");
				System.out.println("2. Volume");
				System.out.print("Pilihan : ");

				a = masuk.nextInt();

				switch (a) {
					case 1:
						clearScreen();
						System.out.println("Menghitung Luas Permukaan Kerucut");
						System.out.println("Diketahui : ");
						System.out.print("Phi : ");
						phi = masuk.nextDouble();
						System.out.print("Rusuk  : ");
						r = masuk.nextDouble();
						System.out.print("Tinggi :");
						t = masuk.nextDouble();
						System.out.print("Sisi  : ");
						s = masuk.nextDouble();

						kerucut.setPhi(phi);
						kerucut.setR(r);
						kerucut.setS(s);
						kerucut.setT(t);
						kerucut.getLuasPermukaan();
						break;

					case 2:
						clearScreen();
						System.out.println("Menghitung Luas Permukaan Bola");
						System.out.println("Diketahui : ");
						System.out.print("Phi    : ");
						phi = masuk.nextDouble();
						System.out.print("Rusuk  : ");
						r = masuk.nextDouble();
						System.out.print("Tinggi : ");
						t = masuk.nextDouble();

						kerucut.setPhi(phi);
						kerucut.setR(r);
						kerucut.setT(t);
						kerucut.getVolume();
				}
				break;
			case 2:
				clearScreen();
				System.out.println("Bangun Ruang Bola");
				System.out.println("Pilih yang akan dihitung!");
				System.out.println("1. Luas Permukaan");
				System.out.println("2. Volume");
				System.out.print("Pilihan : ");
				b = masuk.nextInt();

				switch (b) {
					case 1:
						clearScreen();
						System.out.println("Menghitung Luas Permukaan Bola");
						System.out.println("Diketahui : ");
						System.out.print("Phi    : ");
						phi = masuk.nextDouble();
						System.out.print("Rusuk  : ");
						r = masuk.nextDouble();
						bola.setPhi(phi);
						bola.setR(r);
						bola.getLuasPermukaan();
						break;
					case 2:
						clearScreen();
						System.out.println("Menghitung Volume Bola ");
						System.out.println("Diketahui : ");
						System.out.print("Phi    : ");
						phi = masuk.nextDouble();
						System.out.print("Rusuk  : ");
						r = masuk.nextDouble();
						bola.setPhi(phi);
						bola.setR(r);
						bola.getVolume();
						break;
				}
				break;
		}
		masuk.close();
	}
}
