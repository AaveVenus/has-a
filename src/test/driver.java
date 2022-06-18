package test;

import java.util.Scanner;

public class driver {
	
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	public static void main(String[] args) {
		int pilih;
		int ronde = 1;
		String name[] = new String[2];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Selamat Datang Dipertarungan");
		hero hero[] = new hero[2];
		System.out.println("---------------------------------------------------");
		System.out.print("Silahkan Masukan Nama Hero kamu : ");
		name[0] = input.nextLine();
		System.out.print("Silahkan Masukan Nama Hero musuh : ");
		name[1] = input.nextLine();
		for (int i = 0; i < 2; i++) {
			//clearScreen();
			System.out.println("SILAHKAN PILIH ROLE HERO");
			System.out.println("1. Assassin");
			System.out.println("2. Tank");
			System.out.println("3. Mage");
			System.out.print("Pilih hero ke - " + (i + 1) + ": ");
			pilih = input.nextInt();
			if (pilih == 1) {
				hero[i] = new assasin(90, name[i]);
			} else if (pilih == 2) {
				hero[i] = new tank(80, name[i]);
			} else if (pilih == 3) {
				hero[i] = new mage(85, name[i]);
			}
		}
		hero[0].checkStatus();
		hero[1].checkStatus();
		
		System.out.println();
		System.out.println("---------------------------------------------------");
		System.out.println("PERTANDINGAN DIMULAI");
		do {
			System.out.println();
			System.out.println("RONDE " + ronde++);
			System.out.println(hero[0].name + " menyerang");
			hero[0].attack(hero[1]);
			if (hero[1].healthPoint <= 0) {
				System.out.println("HERO " + hero[1].name + " MATI");
				break;
			}
			
			System.out.println(hero[1].name + " menyerang");
			hero[1].attack(hero[0]);
			if (hero[0].healthPoint <= 0) {
				System.out.println("HERO " + hero[0].name + " MATI");
				break;
			}
		} while (hero[0].healthPoint > 0 || hero[1].healthPoint > 0);
	}
}
