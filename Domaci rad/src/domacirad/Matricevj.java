package domacirad;

import java.util.Scanner;

public class Matricevj {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesi broj clanova(red kolona)");
		int red=ulaz.nextInt();		
		int kolona=ulaz.nextInt();
		int [][] niz = new int [red][kolona];
		System.out.println("Ucitaj clanove matrice");
		for(int i=0;i<red;i++) {
			for(int j = 0;j<kolona;j++) {
				System.out.println("X[" + i + "," + j + "]" + "--->");
				niz[i][j] = ulaz.nextInt();
			}
		}
		
		for(int i=0;i<red;i++) {
			for(int j = 0;j<kolona;j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
	}

	}
}
